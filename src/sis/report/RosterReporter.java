package sis.report;

import sis.studentinfo.CourseSession;

public class RosterReporter {
	static final String NEWLINE = System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "학생 목록" + NEWLINE + "----" + NEWLINE;
	static final String ROSTER_REPORT_FOOTER = "\n학생 수 : ";
	CourseSession session;
	
	public RosterReporter(CourseSession session) {
		this.session = session;
	}

	public String getReport() {
		 StringBuilder sb = new StringBuilder(ROSTER_REPORT_HEADER);
		 for(int i=0; i<session.getNumberOfStudents(); i++) {
			 sb.append(session.findStudent(i).getName());
			 sb.append(NEWLINE); 
		 }
		 sb.append(ROSTER_REPORT_FOOTER);
		 sb.append(session.getNumberOfStudents());
		return sb.toString();
	}
}
