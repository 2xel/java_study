package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class HonorGradingStrategy implements GradingStrategy {

	@Override
	public int getPoint(Grade grade) {
		if (grade == Grade.A) {
			return 5;
		}
		if (grade == Grade.B) {
			return 4;
		}
		if (grade == Grade.C) {
			return 3;
		}
		if (grade == Grade.D) {
			return 2;
		}
		return 0;
	}
}