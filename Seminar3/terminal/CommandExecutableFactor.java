package Seminar3.terminal;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;
import Seminar3.terminal.executeble.CreateStudentExecutable;
import Seminar3.terminal.executeble.DeleteNumberAge;
import Seminar3.terminal.executeble.DeleteStudentExecutable;
import Seminar3.terminal.executeble.DeleteStudentFirstName;

public class CommandExecutableFactor {
    StudentService studentService;

    public CommandExecutable create(String[] input) {
        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(
                    studentService, new Student(input[1]));
        } else if (input[0].equals("/delete")) {
            return new DeleteStudentExecutable(
                    studentService, new Student(input[1]));
        } else if (input[0].equals("/deletFirstName")) {
            return new DeleteStudentFirstName(studentService, new Student(input[1]));
        } else if (input[0].equals("/deletNumberAge")) {
            return new DeleteNumberAge(studentService, new Student(input[1]));
        } else
            return null;
    }
}
