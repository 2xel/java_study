package sis.studentinfo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java_study.Calculator;
import sis.studentinfo.Student;

public class StudentTest {
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