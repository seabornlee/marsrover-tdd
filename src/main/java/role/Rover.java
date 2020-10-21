package role;

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
        this.orientation = "W";
    }
}
