package sis.report;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompareToTest {
	@Test
	public void compareTo() throws Exception {
		assertTrue("A".compareTo("B") < 0);
		assertEquals(0, "A".compareTo("A"));
		assertTrue("B".compareTo("A") > 0);
	}
}
