package role;

import static role.Orientation.LEFT;

public class Rover {
    private static final String NESW = "NESW";
    private int x = 0;
    private int y = 0;
    private String direction = "N";

    public String getPosition() {
        return this.x + "," + y + "," + this.direction;
    }

    public void move(int offset) {
        if (this.direction.equals("W")) {
            this.x = this.x - offset;
            return;
        }

        if (this.direction.equals("E")) {
            this.x = this.x + offset;
            return;
        }

        if (this.direction.equals("N")) {
            this.y = this.y + offset;
            return;
        }

        this.y = this.y - offset;
    }

    public void turn(Orientation orientation) {
        int offset = orientation == LEFT ? -1 : 1;
        int indexOfNewDirection = NESW.indexOf(this.direction) + offset;
        this.direction = String.valueOf(NESW.charAt((indexOfNewDirection + NESW.length()) % NESW.length()));
    }
}
