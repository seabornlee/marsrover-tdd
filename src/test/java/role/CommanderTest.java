package role;

import commands.Command;
import commands.CommandParser;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommanderTest {

    @Test
    public void 发送指令_前进一步() {
        Commander commander = new Commander();
        List<Command> commands = CommandParser.parse("F");
        Rover rover = new Rover();
        for (Command command : commands) {
            command.execute(rover);
        }
        String result = rover.getPosition();
        assertThat(result).isEqualTo("0,1,N");
    }
}