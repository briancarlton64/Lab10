import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    private DrawPanel drawPanel;
    public DrawFrame(String title)
    {
        super(title);
    }

    public static void main(String[] args) throws InterruptedException {
        DrawFrame abc = new DrawFrame("Hello");
        abc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        abc.setSize(300,300);
        abc.setLocationRelativeTo(null);
        abc.setVisible(true);
        DrawPanel panel = new DrawPanel();
        abc.add(panel);



        {
            boolean bool = Math.random()>.5;
            panel.addShape(new Sinusoid(Color.BLACK,new Point(100,100),100,10,100));
            panel.addShape(new RightTriangle(new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
            panel.addShape(new IsoscelesTriangle(new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
            panel.addShape(new Square(new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
            panel.addShape(new Rectangle(new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
            panel.addShape(new Oval(new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
            panel.addShape(new Circle(new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
            panel.addShape(new Diamond(new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
            panel.addShape(new PolyLine(new Point((int)(Math.random()*500),(int)(Math.random()*500)), new Point((int)(Math.random()*500),(int)(Math.random()*500)),(int)(Math.random()*500),Color.getHSBColor((float)Math.random(),(float)Math.random(),(float)Math.random()),bool));
        }
        abc.revalidate();
        abc.repaint();
        Thread.sleep(100);
        while(true){
            int rand = (int) (Math.random()*10);
            boolean bool = Math.random()>.5;
            switch (rand) {


                case 1:  panel.addShape(new Sinusoid(Color.BLACK, new Point(100, 100), 100, 10, 100));break;
                case 2:  panel.addShape(new RightTriangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
                case 3: panel.addShape(new IsoscelesTriangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
                case 4: panel.addShape(new Square(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
                case 5: panel.addShape(new Rectangle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
                case 6: panel.addShape(new Oval(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
                case 7: panel.addShape(new Circle(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
                case 8: panel.addShape(new Diamond(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
                case 9: panel.addShape(new PolyLine(new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), new Point((int) (Math.random() * 500), (int) (Math.random() * 500)), (int) (Math.random() * 500), Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()), bool));break;
            }
            Thread.sleep(10);
            abc.revalidate();
            abc.repaint();
        }

    }
}
