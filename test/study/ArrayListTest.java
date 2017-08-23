package study;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import sis.studentinfo.Student;

public class ArrayListTest {
	@Test
	public void sort() throws Exception {
		ArrayList<String> values = new ArrayList<>();
		values.add("KOR");
		values.add("CHN");
		values.add("ENG");
		Collections.sort(values);
		for (String value : values) {
			System.out.println(value);
		}
	}
	
	@Test
	public void study() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");

		assertEquals(2, list.size()); // list의 크기를 구하라.
		assertEquals("first", list.get(0)); // 첫 번째 값을 찾아라.
		assertEquals(true, list.contains("first")); // "first" 값이 포함되어 있는지를 확인해라.
		assertEquals("first", list.remove(0)); // 첫 번째 값을 삭제해라.
		assertEquals(false, list.contains("first")); // "first" 값이 포함되어 있는지를 확인해라.
		list.add(0, "third");	//첫 번째 값을 third로 바꿔라
		assertEquals("third", list.get(0));
	}

	@Test
	public void study2() throws Exception {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("first"));
		list.add(new Student("second"));
		
		assertEquals(true, list.contains(new Student("first")));
	}
}