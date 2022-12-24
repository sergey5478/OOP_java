package Seminar3.service;


import Seminar3.data.StudentGroup;

public interface StudentGroupInterf {
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
    void remove(String fio);
    void sorted(StudentGroup studentGroup);

}
