import java.awt.*;

public abstract class Shape implements Drawable{
    protected Point[] location;
    private Color color;
    private Boolean filled;
    public Shape(Color color, Boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public boolean isFilled(){
        return filled;
    }

    public Color getColor() {
        return color;
    }
    public Point[] getLocation() {
        return location;

    }
}
