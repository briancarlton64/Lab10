import java.awt.*;

/**
 * An abstract class representing a shape.
 */
public abstract class Shape implements Drawable{
    /**
     * A point array storing the location of each point of the shape.
     */
    protected Point[] location;
    /**
     * The color of the shape.
     */
    private Color color;
    /**
     * Is the shape filled?
     */
    private Boolean filled;

    /**
     * Constructs a shape.
     * @param color color of the shape.
     * @param filled Is the shape filled?
     */
    public Shape(Color color, Boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    /**
     * Is this shape filled?
     * @return The field filled
     */
    public boolean isFilled(){
        return filled;
    }

    /**
     * What is the color of this shape?
     * @return The field color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns all the points that make up this shape.
     * @return The field location
     */
    public Point[] getLocation() {
        return location;

    }
}
