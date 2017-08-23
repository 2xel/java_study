package sis.report;

import java.util.ArrayList;
import java.util.Collections;

import sis.studentinfo.CourseSession;

public class CourseReport {
	static final String NEWLINE = System.getProperty("line.separator");
	private ArrayList<CourseSession> sessions = new ArrayList<>();
	
	public void add(CourseSession session) {
		sessions.add(session);
	}

	public String text() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(sessions);
		for(int i=0; i < sessions.size(); i++) {
			sb.append(sessions.get(i).getDepartment().toString());
			sb.append(" ");
			sb.append(sessions.get(i).getNumber().toString());
			sb.append(NEWLINE);
		}
		return sb.toString();
	}

}
