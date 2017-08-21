package sis.report;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import sis.studentinfo.CourseSession;
import sis.studentinfo.Student;

public class RosterReporterTest {
    @Test
    public void report() throws Exception {
        Date startDate = new Date();
        CourseSession session = CourseSession.create("ENGL", "200", startDate);
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReporter(session).getReport();
        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER + 
                "A" + RosterReporter.NEWLINE + 
                "B" + RosterReporter.NEWLINE +
                RosterReporter.ROSTER_REPORT_FOOTER + "2", 
                rosterReport);
    }
}