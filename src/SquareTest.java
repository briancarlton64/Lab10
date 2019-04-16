

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Test cases for the Square
 *
 * @author Brian
 * @version April 16, 2019
 * Lab 10
 */
public class SquareTest {
    private static Square pl1 = new Square(new Point(100, 100), 50, Color.BLACK, true);
    private static Point pl1UL = new Point(100, 100);
    private static Point pl1LL = new Point(100, 150);
    private static Point pl1UR = new Point(150, 100);
    private static Point pl1LR = new Point(150, 150);
    private static Square pl2 = new Square(new Point(0, 0), 25, Color.CYAN, false);
    private static Point pl2UL = new Point(0, 0);
    private static Point pl2LL = new Point(25, 0);
    private static Point pl2UR = new Point(0, 25);
    private static Point pl2LR = new Point(25, 25);

    /**
     * plectangle construction
     */
    @Test
    public void testSquareConstructorPointsArrayLength() {
        Point[] pts = pl1.getLocation();
        Assert.assertEquals(4, pts.length);
    }

    /**
     * plectangle construction: points
     */
    @Test
    public void testSquareConstructorCalculatedPoints() {
        Point[] pts1 = pl1.getLocation();
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UL));
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LL));
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1LR));
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts1, pl1UR));

        Point[] pts2 = pl2.getLocation();
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UL));
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LL));
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2LR));
        Assert.assertTrue("Expected point not appearing in Square. Make sure that the points determine the base line "
                        + "and that the thickness determines the parallel line (ad to y).",
                ShapeUtils.pointInSet(pts2, pl2UR));
    }

    /**
     * Unfilled constructor
     */
    @Test
    public void testSquareConstructorUnfilled() {
        Assert.assertFalse("Square fill incorrect.", pl2.isFilled());
    }

    /**
     * Filled constructor
     */
    @Test
    public void testSquareConstructorFilled() {
        Assert.assertTrue("Square fill incorrect.", pl1.isFilled());
    }

    /**
     * Color constructor
     */
    @Test
    public void testSquareConstructorColor() {
        Color clr1 = pl1.getColor();
        Color clr2 = pl2.getColor();
        Assert.assertEquals("Square color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Square color incorrect.", Color.CYAN, clr2);
    }
}
