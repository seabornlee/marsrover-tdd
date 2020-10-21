package commands;

import java.util.List;

import static java.util.Collections.singletonList;

public class CommandParser {
    public static List<Command> parse(String commandsInString) {
        return singletonList(getCommand(commandsInString));
    }

    private static Command getCommand(String commandsInString) {
        Command command;
        if (commandsInString.equals("F")) {
            command = new MoveForwardCommand();
        } else {
            command = new MoveBackCommand();
        }
        return command;
    }
}
