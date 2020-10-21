package role;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void 默认是0_0_N状态() {
        Rover rover = new Rover();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("0,0,N");
    }
}