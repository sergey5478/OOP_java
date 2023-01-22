package Seminar3.data.comparator;

import java.util.Comparator;

import Seminar3.data.Student;

public class StudentComporator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAge().compareTo(student2.getAge());
    }

}
