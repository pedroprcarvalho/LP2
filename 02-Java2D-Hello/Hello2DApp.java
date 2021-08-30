import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(1920, 1080);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g2d.setPaint(Color.blue);
        g2d.drawLine(100,100, 1820,980);
        g2d.drawLine(980,100,980,100);
        g2d.setPaint(Color.green);        
        g2d.drawLine(100,980,100,100);
        g2d.drawLine(1820,100,100,100);
        g2d.drawLine(100,980,1820,980);
        g2d.drawLine(1820,980,1820,100);
        
    }
}
