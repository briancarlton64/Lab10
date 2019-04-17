import java.awt.*;

/**
 * A class representing an isosceles triangle, i.e. a triangle with two congruent sides.
 */
public class IsoscelesTriangle extends Triangle{
    /**
     * Constructs an isosceles triangle.
     * @param pointLB The left bottom point of the triangle.
     * @param base The length of the base.
     * @param height The length from the base to the third point of the triangle.
     * @param color The color of the triangle.
     * @param fill Is the triangle filled?
     */
    public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill){
        super(pointLB,color, fill);
        location[1] = new Point(pointLB.x+base,pointLB.y);
        location[2] = new Point(pointLB.x+(base/2),pointLB.y-height);
    }
}
