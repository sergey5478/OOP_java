package Seminar3.terminal;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;
import Seminar3.terminal.executeble.CreateStudentExecutable;
import Seminar3.terminal.executeble.DeleteStudentExecutable;

public class CommandExecutableFactor {
    StudentService studentService;

    public CommandExecutable create(String[] input) {
        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(
                    studentService, new Student(input[1]));
        } else {
            return new DeleteStudentExecutable(
                    studentService, new Student(input[1]));
        }

    }

}
