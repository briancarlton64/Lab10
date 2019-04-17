import java.awt.*;

/**
 * A class representing a square.
 */
public class Square extends Rectangle {
    /**
     * Constructs a square.
     * @param pointUL The upper left point of the square.
     * @param width The width (and height) of the square.
     * @param color The color of the square.
     * @param filled Is the square filled?
     */
    public Square(Point pointUL, int width, Color color, boolean filled) {
        super(pointUL, width, width, color, filled);
    }
}
