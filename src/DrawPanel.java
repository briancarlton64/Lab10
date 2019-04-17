import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    /**
     * An ArrayList of the current shapes being drawn.
     */
    private ArrayList<Shape> shapeList;

    public DrawPanel(){
        shapeList = new ArrayList<>();
    }

    /**
     * Adds a shape to shapeList
     * @param shape The shape we are adding
     */
    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    /**
     * Removes all the shapes from shapeList.
     */
    public void clearShapes(){shapeList.clear();}

    /**
     * For each shape in shapeList, draw that shape.
     * @param g the graphics that will draw each shape.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shapeList.forEach(shape -> shape.draw(g));
    }
}
