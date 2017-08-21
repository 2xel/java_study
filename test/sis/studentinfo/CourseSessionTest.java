package sis.studentinfo;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import sis.studentinfo.CourseSession;
import sis.utils.DateUtils;

public class CourseSessionTest {
	private CourseSession session;
	private Date startDate;
	private static final int CREDITS = 3;
	
	@Before
	public void setup() {
		startDate = DateUtils.createDate(2017, 5, 17);
		session = CourseSession.create("ENGL", "101", startDate);
		session.setNumberOfCredits(CREDITS);
	}

	@Test
	public void create() throws Exception {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(startDate, session.getStartDate());
		assertEquals(0, session.getNumberOfStudents());

		Date endDate = session.getEndDate();
		assertEquals("2017-06-25", convertDateToString(endDate));
	}
    @Test
    public void enroll() throws Exception {
        Student firstStudent = new Student("재성");
        session.enroll(firstStudent);
        assertEquals(CREDITS, firstStudent.getCredits());
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(firstStudent, session.findStudent(0));

        Student secondStudent = new Student("주한");
        session.enroll(secondStudent);
        assertEquals(CREDITS, firstStudent.getCredits());
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(secondStudent, session.findStudent(1));
    }
    	
	@Test
	public void count() throws Exception {
		CourseSession.restCount();
		assertEquals(1, CourseSession.getCount());
		createCourseSession();
		assertEquals(2, CourseSession.getCount());
	}

	private CourseSession createCourseSession() {
		return CourseSession.create("ENGL", "101", startDate);
	}

	private String convertDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
}