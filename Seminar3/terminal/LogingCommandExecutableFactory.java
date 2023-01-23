package Seminar3.terminal;

import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;

public class LogingCommandExecutableFactory extends CommandExecutableFactorImpl {

    public LogingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.println("GEEK");
        return result;

    }

}
