package role;

import static role.Orientation.LEFT;

public class Rover {
    private int x = 0;
    private int y = 0;
    private String direction = "N";

    public String getPosition() {
        return this.x + "," + y + "," + this.direction;
    }

    public void move(int offset) {
        this.y = this.y + offset;
    }

    public void turn(Orientation orientation) {
        if (orientation == LEFT) {
            if (this.direction.equals("N")) {
                this.direction = "W";
            }
        } else {
            if (this.direction.equals("N")) {
                this.direction = "E";
            } else if (this.direction.equals("E")) {
                this.direction = "S";
            }
        }
    }
}
