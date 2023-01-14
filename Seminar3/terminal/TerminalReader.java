package Seminar3.terminal;

import java.util.Scanner;

import Seminar3.terminal.executeble.CommanStudentDeleteFirstName;
import Seminar3.terminal.executeble.CommandDeleteNumberAge;
import Seminar3.terminal.executeble.CommandExecutable;

public class TerminalReader {

    private static TerminalReader terminalReader;

    private ComandParser comandParser;

    public static TerminalReader getInstans(ComandParser comandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(comandParser);
        }
        return terminalReader;
    }

    public TerminalReader(ComandParser comandParser) {
        this.comandParser = comandParser;
    }

    public void getI(int f) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String coand = in.nextLine();

            String[] cool = comandParser.parseCommand(coand);

            CommandExecutableFactor commandExecutableFactor = new CommandExecutableFactor();

            CommandExecutable commandExecutable = commandExecutableFactor.create(cool);

            commandExecutable.execute();
            in.close();
        }

    }

    public void deleteStudentFirstName() {

        CommandStudentFirstNameFactor commandStudentFirstNameFactor = new CommandStudentFirstNameFactor();

        CommanStudentDeleteFirstName commanStudentDeleteFirstName = commandStudentFirstNameFactor.deleteFirstName(null);

        commanStudentDeleteFirstName.deletStudentFirstName();
    }

    public void deletStudentNumberAge() {
        CommandStudentNumberAgeFactor commandStudentNumberAgeFactor = new CommandStudentNumberAgeFactor();

        CommandDeleteNumberAge commandDeleteNumberAge = commandStudentNumberAgeFactor.deleteNumberAge(0, 0);

        commandDeleteNumberAge.deletStudentNumberAge();
    }
}
