package study;

import java.util.ArrayList;

import sis.studentinfo.Student;

public class CodesquadClass implements MyClass, YourClass {
	private ArrayList<Student> students = new ArrayList<>();

	@Override
	public int countStudents() {
		return students.size();
	}

	@Override
	public Student getStudent(String name) {
		return null;
	}

	@Override
	public String getTeacherName() {
		return "여러개가능";
	}

}
