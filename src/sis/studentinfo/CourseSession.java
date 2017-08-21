package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CourseSession {
	private String department;
	private String number;
	private Date startdate;
	private ArrayList<Student> students = new ArrayList<>();
	private static int count;
	private int credits;

	private CourseSession(String department, String number, Date startdate) {
		this.department = department;
		this.number = number;
		this.startdate = startdate;
		CourseSession.increaseCount();
	}

	public static CourseSession create(String department, String number, Date startdate) {
		return new CourseSession(department, number, startdate);
	}

	public static CourseSession createEnglish(Date startdate) {
		return new CourseSession("ENGL", "101", startdate);
	}

	public static CourseSession createMath(Date startdate) {
		return new CourseSession("MATH", "102", startdate);
	}

	private static void increaseCount() {
		count++;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public void enroll(Student student) {
		student.addCredits(credits);
		students.add(student);
	}

	public Student findStudent(int index) {
		return students.get(index);
	}

	public void drop(Student student) {
		students.remove(student);
	}

	public Date getStartDate() {
		return startdate;
	}

	public Date getEndDate() {
		Calendar date = Calendar.getInstance();
		date.setTime(startdate);
		date.add(Calendar.DAY_OF_YEAR, 6 * 7 - 3);
		return date.getTime();
	}

	public static void restCount() {
		count = 0;
	}

	public static int getCount() {
		return count;
	}

	public void setNumberOfCredits(int credits) {
		this.credits = credits;
	}
}