import java.awt.*;

/**
 * A class representing a right triangle.
 */
public class RightTriangle extends Triangle{
    /**
     * Constructs an isosceles triangle.
     * @param pointRA The point of the Right angle of the triangle.
     * @param base The length of the base.
     * @param height The length from the base to the third point of the triangle.
     * @param color The color of the triangle.
     * @param fill Is the triangle filled?
     */
    public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill){
        super(pointRA,color, fill);
        location = new Point[3];
        location[0] = pointRA;
        location[1] = new Point(location[0].x+base,location[0].y);
        location[2] = new Point(location[0].x,location[0].y-height);
    }
}
