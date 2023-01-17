package Seminar3.terminal;

import java.util.Scanner;
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

    public void getI(int fine) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String comand = in.nextLine();
            String[] cool = comandParser.parseCommand(comand);
            CommandExecutableFactor commandExecutableFactor = new CommandExecutableFactor();
            CommandExecutable commandExecutable = commandExecutableFactor.create(cool);
            commandExecutable.execute();
            in.close();
        }

    }

}
