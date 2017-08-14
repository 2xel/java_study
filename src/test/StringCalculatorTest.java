package test;

import static org.junit.Assert.*;

import org.junit.Test;

import java_study.StringCalculator;

public class StringCalculatorTest {
	StringCalculator scal = new StringCalculator();
	
	@Test
	public void add() throws Exception {
		int result = scal.calculate("8 + 4");
		assertEquals(12, result);
	}
	@Test
	public void minus() throws Exception {
		int result = scal.calculate("8 - 4");
		assertEquals(4, result);
	}
	@Test
	public void multi() throws Exception {
		int result = scal.calculate("8 * 4");
		assertEquals(32, result);
	}
	@Test
	public void divide() throws Exception {
		int result = scal.calculate("8 / 4");
		assertEquals(2, result);
	}
}
