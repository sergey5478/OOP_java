package Seminar3.terminal.executeble;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;

public class DeleteNumberAge implements CommandDeleteNumberAge {

    private StudentService studentService;

    private Student student;

    public DeleteNumberAge(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void deletStudentNumberAge() {
        studentService.deletStudentNumberAge(student);
    }

}
