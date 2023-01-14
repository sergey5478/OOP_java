package Seminar3.terminal;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandDeleteNumberAge;
import Seminar3.terminal.executeble.DeleteNumberAge;

public class CommandStudentNumberAgeFactor {
    StudentService studentService;

    public CommandDeleteNumberAge deleteNumberAge(int namber, int age) {
        return new DeleteNumberAge(
                studentService, new Student(namber, age));
    }    
}
