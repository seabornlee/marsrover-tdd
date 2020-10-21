package role;

import commands.Command;
import commands.MoveBackCommand;
import commands.MoveForwardCommand;
import commands.TurnLeftCommand;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommanderTest {

    @Test
    public void 发送指令_前进一步() {
        Commander commander = new Commander();
        String position = commander.send(singletonList(new MoveForwardCommand()));
        assertThat(position).isEqualTo("0,1,N");
    }

    @Test
    public void 发送指令_左转() {
        Commander commander = new Commander();
        String position = commander.send(singletonList(new TurnLeftCommand()));
        assertThat(position).isEqualTo("0,0,W");
    }

    @Test
    public void 发送指令_后退() {
        Commander commander = new Commander();
        String position = commander.send(Arrays.asList(new MoveForwardCommand(), new MoveBackCommand()));
        assertThat(position).isEqualTo("0,0,N");
    }
}