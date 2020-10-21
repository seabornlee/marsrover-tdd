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

    @Test
    public void 右转() {
        Rover rover = new Rover();
        rover.turn(Orientation.RIGHT);
        assertThat(rover.getPosition()).isEqualTo("0,0,E");
        rover.turn(Orientation.RIGHT);
        assertThat(rover.getPosition()).isEqualTo("0,0,S");
        rover.turn(Orientation.RIGHT);
        assertThat(rover.getPosition()).isEqualTo("0,0,W");
        rover.turn(Orientation.RIGHT);
        assertThat(rover.getPosition()).isEqualTo("0,0,N");
    }

    @Test
    public void 左转() {
        Rover rover = new Rover();
        rover.turn(Orientation.LEFT);
        assertThat(rover.getPosition()).isEqualTo("0,0,W");
        rover.turn(Orientation.LEFT);
        assertThat(rover.getPosition()).isEqualTo("0,0,S");
        rover.turn(Orientation.LEFT);
        assertThat(rover.getPosition()).isEqualTo("0,0,E");
        rover.turn(Orientation.LEFT);
        assertThat(rover.getPosition()).isEqualTo("0,0,N");
    }

    @Test
    public void 前进_朝北() {
        Rover rover = new Rover();
        rover.move(1);
        assertThat(rover.getPosition()).isEqualTo("0,1,N");
    }

    @Test
    public void 前进_朝南() {
        Rover rover = new Rover();
        moveTo0_1_S(rover);

        rover.move(1);

        assertThat(rover.getPosition()).isEqualTo("0,0,S");
    }

    @Test
    public void 前进_朝东() {
        Rover rover = new Rover();
        rover.turn(Orientation.RIGHT);

        rover.move(1);

        assertThat(rover.getPosition()).isEqualTo("1,0,E");
    }

    @Test
    public void 前进_朝西() {
        Rover rover = new Rover();
        moveRoverTo1_0_W(rover);

        rover.move(1);

        assertThat(rover.getPosition()).isEqualTo("0,0,W");
    }

    private void moveRoverTo1_0_W(Rover rover) {
        rover.turn(Orientation.RIGHT);
        rover.move(1);
        rover.turn(Orientation.RIGHT);
        rover.turn(Orientation.RIGHT);
    }

    private void moveTo0_1_S(Rover rover) {
        rover.move(1);
        rover.turn(Orientation.LEFT);
        rover.turn(Orientation.LEFT);
    }

    @Test
    public void 后退() {
        Rover rover = new Rover();
        rover.move(1);
        rover.move(1);
        rover.move(-1);
        assertThat(rover.getPosition()).isEqualTo("0,1,N");
    }
}