package Seminar3.terminal;

import java.util.List;
import static java.util.Arrays.asList;

public class CommandParserImpl implements ComandParser {
    public Command parseCommand(String inputCommand) {
        List<String> list = asList(inputCommand.split("\\s+"));
        return new Command(list);
    }

}