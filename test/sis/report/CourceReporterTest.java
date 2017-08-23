package sis.report;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import sis.studentinfo.CourseSession;

public class CourceReporterTest {
	static final String NEWLINE = System.getProperty("line.separator");

	@Test
	public void report() throws Exception {
		final Date date = new Date();
		CourseReport report = new CourseReport();
		report.add(CourseSession.create("KOR", "110", date));
		report.add(CourseSession.create("ENGL", "201", date));
		report.add(CourseSession.create("CHN", "313", date));

		assertEquals("KOR 110" + NEWLINE + "ENGL 201" + NEWLINE + "CHN 313" + NEWLINE, report.text());
	}

	@Test
	public void report2() throws Exception {
		final Date date = new Date();
		CourseReport report = new CourseReport();
		report.add(CourseSession.create("KOR", "110", date));
		report.add(CourseSession.create("ENGL", "201", date));
		report.add(CourseSession.create("CHN", "313", date));

		assertEquals("CHN 313" + NEWLINE + "ENGL 201" + NEWLINE + "KOR 110" + NEWLINE, report.text());
	}
}
