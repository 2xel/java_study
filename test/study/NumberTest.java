package study;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {
	@Test
	public void doubleEquals() throws Exception {
		System.out.println(3 * 0.3);
		assertEquals(0.9, 3 * 0.3, 0.01);
	}
}
