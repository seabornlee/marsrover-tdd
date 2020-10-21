package commands;

import java.util.List;

import static java.util.Collections.singletonList;

public class CommandParser {
    public static List<Command> parse(String commandsInString) {
        return singletonList(new MoveForwardCommand());
    }
}
