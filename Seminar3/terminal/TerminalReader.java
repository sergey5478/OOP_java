package Seminar3.terminal;

import java.util.Scanner;

import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private ComandParser comandParser;
    private StudentService studentService;

    public static TerminalReader getInstans(ComandParser comandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(comandParser);
        }
        return terminalReader;
    }

    public TerminalReader(ComandParser comandParser) {
        this.comandParser = comandParser;
    }

    public void getI(int fine) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String comand = in.nextLine();

            // Command cool = comandParser.parseCommand(comand);
            CommandExecutableFactorImpl commandExecutableFactor = new LogingCommandExecutableFactory(studentService);
            CommandExecutable commandExecutable = commandExecutableFactor.create(comandParser.parseCommand(comand));

            commandExecutable.execute();
            in.close();
        }

    }

}
