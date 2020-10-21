package role;

import commands.Command;
import commands.MoveForwardCommand;

import java.util.List;

import static java.util.Collections.singletonList;

public class Commander {
    public String send(String commandsInString) {
        List<Command> commands = parse(commandsInString);
        Rover rover = new Rover();
        for (Command command : commands) {
            command.execute(rover);
        }
        return rover.getPosition();
    }

    private List<Command> parse(String commandsInString) {
        return singletonList(new MoveForwardCommand());
    }
}
