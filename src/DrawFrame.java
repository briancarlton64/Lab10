import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    private static DrawPanel drawPanel;

    public DrawFrame(String title) {
        super(title);
        drawPanel = new DrawPanel();
    }

    public static void main(String[] args) throws InterruptedException {
        DrawFrame abc = new DrawFrame("Hello");
        abc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        abc.setSize(300, 300);
        abc.setLocationRelativeTo(null);
        abc.setVisible(true);
        drawPanel = new DrawPanel();
        abc.add(drawPanel);

        boolean bool = Math.random() > .5;
        drawPanel.addShape(new Sinusoid(Color.BLACK, new Point(100, 100), 100, 10, 100));
        drawPanel.addShape(new RightTriangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
        drawPanel.addShape(new IsoscelesTriangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
        drawPanel.addShape(new Square(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
        drawPanel.addShape(new Rectangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
        drawPanel.addShape(new Oval(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
        drawPanel.addShape(new Circle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
        drawPanel.addShape(new Diamond(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
        drawPanel.addShape(new PolyLine(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));

        abc.revalidate();
        abc.repaint();
        int i = 0;
        Thread.sleep(100);
        while (true) {
            if (i % 50 == 0) {
                drawPanel.clearShapes();
            }
            int rand = (int) (Math.random() * 10);
            bool = Math.random() > .5;
            switch (rand) {
                case 1:
                    drawPanel.addShape(new Sinusoid(Color.BLACK, new Point(100, 100), 100, 10, 100));
                    break;
                case 2:
                    drawPanel.addShape(new RightTriangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
                case 3:
                    drawPanel.addShape(new IsoscelesTriangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
                case 4:
                    drawPanel.addShape(new Square(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
                case 5:
                    drawPanel.addShape(new Rectangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
                case 6:
                    drawPanel.addShape(new Oval(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
                case 7:
                    drawPanel.addShape(new Circle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
                case 8:
                    drawPanel.addShape(new Diamond(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
                case 9:
                    drawPanel.addShape(new PolyLine(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));
                    break;
            }
            Thread.sleep(50);
            abc.revalidate();
            abc.repaint();
            i++;
        }

    }
}
