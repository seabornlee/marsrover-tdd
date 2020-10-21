package commands;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandParserTest {

    @Test
    public void parse_前进一步() {
        List<Command> commands = CommandParser.parse("F");
        assertThat(commands).hasSize(1);
        assertThat(commands.get(0)).isInstanceOf(MoveForwardCommand.class);
    }
}