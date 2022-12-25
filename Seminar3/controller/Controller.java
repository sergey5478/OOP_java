package Seminar3.controller;

import java.util.List;

import Seminar3.data.GroupStream;
import Seminar3.data.Student;
import Seminar3.data.StudentGroup;
import Seminar3.service.StudentGroupInterf;
import Seminar3.service.StudentServiceImpl;
import Seminar3.service.StudentStreamInterf;

public class Controller {
    private StudentServiceImpl studentServiceImpl;
    private StudentGroupInterf studentGroupInterf;
    private StudentStreamInterf studentStreamInterf;

    public Controller(StudentServiceImpl studentServiceImpl, StudentGroupInterf studentGroupInterf,
            StudentStreamInterf studentStreamInterf) {
        this.studentServiceImpl = studentServiceImpl;
        this.studentGroupInterf = studentGroupInterf;
        this.studentStreamInterf = studentStreamInterf;
    }

    public Student createStudent(Student student) {
        studentServiceImpl.create(student);
        return (Student) studentServiceImpl.read(student);
    }

    public StudentGroup createGroup(int groupNumber) {
        return studentGroupInterf.getGroup(groupNumber);
    }

    public void studentStreamSort(List<GroupStream> groupStream) {
        studentStreamInterf.groupStreamSort(groupStream);
    }
}
