package commands;

import java.util.ArrayList;
import java.util.List;

public class CommandParser {
    public static List<Command> parse(String commandsInString) {
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < commandsInString.length(); i++) {
            commands.add(getCommand(String.valueOf(commandsInString.charAt(i))));
        }
        return commands;
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
