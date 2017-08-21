package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import java_study.StringCalculator;

public class StringCalculatorTest {
	StringCalculator scal = new StringCalculator();
	
	@Test
	public void add() throws Exception {
		int result = scal.calculate("8 + 2");
		assertEquals(5, result);
	}
}
