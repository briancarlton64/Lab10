import java.awt.*;

/**
 * A class representing a rectangle.
 */
public class Rectangle extends Polygon {
    /**
     * Constructs a rectangle.
     *
     * @param pointUL The upper left point of the rectangle.
     * @param width   The width of the rectangle.
     * @param height  The height of the rectangle.
     * @param color   The color of the rectangle.
     * @param filled  Is the rectangle filled?
     */
    public Rectangle(Point pointUL, int width, int height, Color color, boolean filled) {
        super(color, filled);
        location = new Point[4];
        location[0] = pointUL;
        location[1] = new Point(pointUL.x + width, pointUL.y);
        location[3] = new Point(pointUL.x, pointUL.y - height);
        location[2] = new Point(pointUL.x + width, pointUL.y - height);
    }
}
