package Seminar3.terminal;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommanStudentDeleteFirstName;
import Seminar3.terminal.executeble.DeleteStudentFirstName;

public class CommandStudentFirstNameFactor {
    StudentService studentService;

    public CommanStudentDeleteFirstName deleteFirstName(String firstName) {
        return new DeleteStudentFirstName(
                studentService, new Student(firstName, firstName));
    }
}
