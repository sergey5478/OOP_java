package Seminar3.terminal;

import java.util.List;

public class Command {
    private static final String ADD = "/add";
    private static final String DEL = "/delete";

    private List<String> arguments;
    private String mainFirstCommand;

    public String getFirstArgument() {
        return arguments.get(0);
    }

    public boolean isCreateCommand() {
        return mainFirstCommand.equals(ADD);
    }

    public boolean isDeleteCommand() {
        return mainFirstCommand.equals(DEL);
    }
}