package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class EliteGradingStrategy implements GradingStrategy{

	@Override
	public int getPoint(Grade grade) {
		return 5;
	}
}