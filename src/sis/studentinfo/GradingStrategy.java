package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public interface GradingStrategy {
    int getPoint(Grade grade);
}