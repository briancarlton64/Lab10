import java.awt.*;

public class PolyLine extends Polygon{

    public PolyLine(Point pointUL,Point pointUR,
                    int thickness, Color color, boolean fill){
        super(color,fill);
        location = new Point[4];
        location[0]=pointUL;
        location[1]=new Point(pointUL.x,pointUL.y+thickness);
        location[3]=pointUR;
        location[2]=new Point(pointUR.x,pointUR.y+thickness);
    }
}
