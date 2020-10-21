package helper;

import role.Orientation;
import role.Rover;

public class RoverHelper {
    public static void turnBack(Rover rover) {
        rover.turn(Orientation.LEFT);
        rover.turn(Orientation.LEFT);
    }
}
