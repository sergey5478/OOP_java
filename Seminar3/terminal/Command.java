package Seminar3.terminal;

import java.util.ArrayList;
import java.util.List;

public class Command {
    public static final String ADD = "/add";
    public static final String DEL = "/delete";

    private final String mainFirstCommand;
    private final List<String> arguments;

    public Command(List<String> comands) {
        this.mainFirstCommand = comands.get(0);
        this.arguments = new ArrayList<>(comands);

        if (arguments.size() > 0) {
            arguments.remove(0);
        }
    }

    public List<String> getArguments() {
        return arguments;
    }

    public String getMainFirstCommand() {
        return mainFirstCommand;
    }

    public boolean isCreateCommand() {
        return mainFirstCommand.equals(ADD);
    }

    public boolean isDeleteCommand() {
        return mainFirstCommand.equals(DEL);
    }

    public String getFirstArgument() {
        return arguments.get(0);
    }

    public static String getAdd() {
        return ADD;
    }

    public static String getDel() {
        return DEL;
    }

    @Override
    public String toString() {
        return "Command{" +
                "mainCommand='" + mainFirstCommand + '\'' +
                ", attributes=" + arguments +
                '}';
    }
}