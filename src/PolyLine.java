import java.awt.*;

/**
 * A class representing a polyline, or in this implementation, a parallelogram.
 */
public class PolyLine extends Polygon {
    /**
     * Constructs a polyline.
     *
     * @param pointUL   The upper left point
     * @param pointUR   The upper right point
     * @param thickness The distance from the upper points to the lower points
     * @param color     The color of the polyline
     * @param fill      Is the polyline filled?
     */
    public PolyLine(Point pointUL, Point pointUR,
                    int thickness, Color color, boolean fill) {
        super(color, fill);
        location = new Point[4];
        location[0] = pointUL;
        location[1] = new Point(pointUL.x, pointUL.y - thickness);
        location[3] = pointUR;
        location[2] = new Point(pointUR.x, pointUR.y - thickness);
    }
}
