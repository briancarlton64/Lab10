import java.awt.*;

public class Oval extends Shape{
    /**
     * Width of the oval.
     */
    private int diameter1;
    /**
     * Height of the oval.
     */
    private int diameter2;

    /**
     * A costructor that creates an oval with a given location, width, height, color, and fill.
     * @param pointUL location of the oval.
     * @param d1 Width of the oval.
     * @param d2 Height of the oval.
     * @param color Color of the oval.
     * @param filled If the oval is filled.
     */
    public Oval(Point pointUL, int d1, int d2, Color color, Boolean filled)
    {
        super(color, filled);
        diameter1=d1;
        diameter2=d2;
        location = new Point[]{pointUL};
    }

    /**
     * Gets the width of the oval.
     * @return diameter1, the width of the oval.
     */
    public int getDiameter1() {
        return diameter1;
    }

    /**
     * Gets the height of the oval.
     * @return diameter2, the height of the oval.
     */
    public int getDiameter2() {
        return diameter2;
    }

    /**
     * Draws this oval.
     * @param g a given graphics that will draw the oval.
     */
    public void draw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.getColor());
        g2d.setStroke(new BasicStroke(5));
        if (!isFilled()) {
            g2d.drawOval(location[0].x, location[0].y, diameter1, diameter2);
        } else {
            g2d.fillOval(location[0].x, location[0].y, diameter1, diameter2);
        }
    }
}

