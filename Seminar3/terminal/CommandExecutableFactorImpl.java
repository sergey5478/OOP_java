package Seminar3.terminal;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;
import Seminar3.terminal.executeble.CreateStudentExecutable;
import Seminar3.terminal.executeble.DeleteStudentExecutable;

public class CommandExecutableFactorImpl implements CommandExecutableFactory {
    private StudentService studentService;

    public CommandExecutable create(Command input) {
        if (input.isCreateCommand()) {
            return new CreateStudentExecutable(
                    studentService, new Student(input.getFirstArgument()));
        } else if (input.isDeleteCommand()) {
            return new DeleteStudentExecutable(
                    studentService, new Student(input.getFirstArgument()));
        } else
            return null;
    }

}
