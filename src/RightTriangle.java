import java.awt.*;

public class RightTriangle extends Triangle{
    public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill){
        super(pointRA,color, fill);
        location = new Point[3];
        location[0] = pointRA;
        location[1] = new Point(location[0].x+base,location[0].y);
        location[2] = new Point(location[0].x,location[0].y+height);
    }
}
