package role;

import static role.Orientation.LEFT;

public class Rover {
    private int x = 0;
    private int y = 0;
    private String orientation = "N";

    public String getPosition() {
        return this.x + "," + y + "," + this.orientation;
    }

    public void move(int offset) {
        this.y = this.y + offset;
    }

    public void turn(Orientation orientation) {
        if (orientation == LEFT) {
            this.orientation = "W";
        } else {
            this.orientation = "E";
        }
    }
}
