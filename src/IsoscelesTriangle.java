import java.awt.*;

public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill){
        super(pointLB,color, fill);
        location[1] = new Point(pointLB.x+base,pointLB.y);
        location[2] = new Point(pointLB.x+(base/2),pointLB.y+height);
    }


}
