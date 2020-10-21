package role;

import commands.Command;

import java.util.List;

public class Commander {

    public String send(List<Command> commands) {
        Rover rover = new Rover();
        for (Command command : commands) {
            command.execute(rover);
        }
        return rover.getPosition();
    }
}
