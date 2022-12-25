package Seminar3.service;

import java.util.Collections;
import java.util.List;

import Seminar3.data.Student;
import Seminar3.data.StudentGroup;
import Seminar3.data.Teacher;
import Seminar3.repository.Repository;

import static Seminar3.util.ReadFromTxt.getStudentsFromTxt;
import static Seminar3.util.ReadFromTxt.getTeacherFromTxt;

public class StudentGroupServiceImpl implements StudentGroupInterf {

    private final Repository<StudentGroup, Integer> studentRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentRepository.save(studentGroup);
    }

    public StudentGroup findStudentGroup(int groupNumber) {
        return studentRepository.findById(groupNumber);
    }

    @Override
    public StudentGroup getGroup() {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList);
    }

    @Override
    public StudentGroup getGroup(int number) {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList, number);
    }

    @Override
    public void remove(String fio) {
        remove(fio);
    }

    @Override
    public void sorted(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

}
