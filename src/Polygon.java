import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Polygon extends Shape{
        public Polygon(Color color, boolean filled){
            super(color,filled);
        }
        public void draw(Graphics graphics){
            int[] xpnts= new int[location.length];
            int[] ypnts= new int[location.length];
            for(int i=0;i<location.length;i++){
                xpnts[i] = location[i].x;
                ypnts[i] = location[i].y;
            }
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.setColor(this.getColor());
            g2d.setStroke(new BasicStroke(5));
            if (!isFilled()) {
                graphics.drawPolygon(xpnts,ypnts,location.length);
            } else {
                graphics.fillPolygon(xpnts,ypnts,location.length);
            }

        }
}