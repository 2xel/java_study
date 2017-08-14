package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java_study.Calculator;

public class CalculatorTest {
	Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator();
	}

	@Test
	public void add() {
		int result = cal.add(8, 4);
		assertEquals(12, result);
	}

	@Test
	public void minus() throws Exception {
		int result = cal.minus(8, 4);
		assertEquals(4, result);
	}

	@Test
	public void multi() throws Exception {
		int result = cal.multi(8, 4);
		assertEquals(32, result);
	}

	@Test
	public void divide() throws Exception {
		int result = cal.divide(8, 4);
		assertEquals(2, result);
	}
}
