import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private ArrayList<Shape> shapeList;
    public DrawPanel(){
        shapeList = new ArrayList<>();
    }
    public void addShape(Shape shape){
        shapeList.add(shape);
    }
    public void clearShapes(){shapeList.clear();}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shapeList.forEach(shape -> shape.draw(g));
    }
}
