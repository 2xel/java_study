package sis.studentinfo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java_study.Calculator;
import sis.studentinfo.Student;
import sis.studentinfo.Student.Grade;

public class StudentTest {
	private static final double GRADE_TOLERANCE = 0.05;

	@Test
	public void calculateHonorStudentGpa() throws Exception {
		assertGpa(createHonorStudent(Grade.A), 5.0);
		assertGpa(createHonorStudent(Grade.B), 4.0);
		assertGpa(createHonorStudent(Student.Grade.C), 3.0);
		assertGpa(createHonorStudent(Student.Grade.D), 2.0);
		assertGpa(createHonorStudent(Student.Grade.F), 0.0);
	}

	private Student createHonorStudent(Student.Grade grade) {
		Student student = new Student("a");
		student.setGradingStrategy(new HonorGradingStrategy());
		student.addGrade(grade);
		return student;
	}

	@Test
	public void calculateGpa() throws Exception {
		Student student = new Student("a");
		student.setGradingStrategy(new NonHonorGradingStrategy());
		assertGpa(student, 0.0);
		student.addGrade(Grade.A);
		assertGpa(student, 4.0);
		student.addGrade(Grade.B);
		assertGpa(student, 3.5);
		student.addGrade(Grade.C);
		assertGpa(student, 3.0);
		student.addGrade(Grade.D);
		assertGpa(student, 2.5);
		student.addGrade(Grade.F);
		assertGpa(student, 2.0);
	}

	private void assertGpa(Student student, double gpa) {
		assertEquals(gpa, student.getGpa(), GRADE_TOLERANCE);
	}

	@Test
	public void create() {
		Student student = new Student("재성");
		Assert.assertEquals("재성", student.getName());

		Student student2 = new Student("규남");
		Assert.assertEquals("규남", student2.getName());
	}

	@Test
	public void calculate() throws Exception {
		Calculator calculator = new Calculator();
	}

	@Test
	public void credits() throws Exception {
		Student student = new Student("a");
		assertEquals(0, student.getCredits());

		student.addCredits(3);
		assertEquals(3, student.getCredits());

		student.addCredits(4);
		assertEquals(7, student.getCredits());

		assertFalse(student.isFullTime());

		student.addCredits(10);
		assertTrue(student.isFullTime());
	}

	@Test
	public void inState() throws Exception {
		Student student = new Student("a");
		assertFalse(student.isInState());

		student.setState(Student.IN_STATE);
		assertTrue(student.isInState());

		student.setState("서울특별시");
		assertFalse(student.isInState());
	}
}