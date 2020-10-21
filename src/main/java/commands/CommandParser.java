package commands;

import java.util.List;

import static java.util.Collections.singletonList;

public class CommandParser {
    public static List<Command> parse(String commandsInString) {
        return singletonList(getCommand(commandsInString));
    }

    private static Command getCommand(String commandsInString) {
        switch (commandsInString) {
            case "F":
                return new MoveForwardCommand();
            case "L":
                return new TurnLeftCommand();
            case "R":
                return new TurnRightCommand();
            default:
                return new MoveBackCommand();
        }
    }
}
