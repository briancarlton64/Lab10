
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Test cases for the IsoscelesTriangle
 *
 * @author Brian
 * @version April 16, 2019
 * Lab 10
 */

public class IsoscelesTriangleTest {
    private static IsoscelesTriangle pl1 = new IsoscelesTriangle(new Point(100, 100), 50, 50, Color.BLACK, true);
    private static Point pl1UL = new Point(100, 100);
    private static Point pl1LL = new Point(150, 100);
    private static Point pl1UR = new Point(125, 150);

    private static IsoscelesTriangle pl2 = new IsoscelesTriangle(new Point(0, 0), 25, 50, Color.CYAN, false);
    private static Point pl2UL = new Point(0, 0);
    private static Point pl2LL = new Point(25, 0);
    private static Point pl2UR = new Point(12, 50);


    /**
     * plectangle construction
     */
    @Test
    public void testIsoscelesTriangleConstructorPointsArrayLength() {
        Point[] pts = pl1.getLocation();
        Assert.assertEquals(3, pts.length);
    }

    /**
     * plectangle construction: points
     */
    @Test
    public void testIsoscelesTriangleConstructorCalculatedPoints() {
        Point[] pts1 = pl1.getLocation();
        Assert.assertTrue("Expected point not appearing in IsoscelesTriangle. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UL));
        Assert.assertTrue("Expected point not appearing in IsoscelesTriangle. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LL));

        Assert.assertTrue("Expected point not appearing in IsoscelesTriangle. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UR));

        Point[] pts2 = pl2.getLocation();
        Assert.assertTrue("Expected point not appearing in IsoscelesTriangle. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UL));
        Assert.assertTrue("Expected point not appearing in IsoscelesTriangle. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LL));

        Assert.assertTrue("Expected point not appearing in IsoscelesTriangle. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UR));
    }

    /**
     * Unfilled constructor
     */
    @Test
    public void testIsoscelesTriangleConstructorUnfilled() {
        Assert.assertFalse("IsoscelesTriangle fill incorrect.", pl2.isFilled());
    }

    /**
     * Filled constructor
     */
    @Test
    public void testIsoscelesTriangleConstructorFilled() {
        Assert.assertTrue("IsoscelesTriangle fill incorrect.", pl1.isFilled());
    }

    /**
     * Color constructor
     */
    @Test
    public void testIsoscelesTriangleConstructorColor() {
        Color clr1 = pl1.getColor();
        Color clr2 = pl2.getColor();
        Assert.assertEquals("IsoscelesTriangle color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("IsoscelesTriangle color incorrect.", Color.CYAN, clr2);
    }
}
