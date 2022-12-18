package Seminar2.service;

import Seminar2.data.StudentGroup;

public interface StudentGroupInterf {

    StudentGroup writer(StudentGroup studentGroup);

    StudentGroup read(StudentGroup studentGroup);
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
}
