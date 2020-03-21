import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas {
    public void paint(Graphics g) {

        g.setColor(Color.green);
        g.drawRect(50, 20, 100, 200);  // (x, y) x = 50, y = 20, width:100, height:200
        g.fillOval(160, 20, 100, 200);  
        g.setColor(Color.blue);
        g.drawOval(200, 430, 200, 100);  // x = 200, y = 430 , width:200, height:100

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100); // the two numbers mean coordinate
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + ", " + y + ")", x, y);

        // Add a red, filled-in square somewhere in the lower-right of the canvas.

        g.setColor(Color.red);
        g.fillRect(700, 700, 50, 50);
    }

    
    public static void main(String[] args) {
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800, 800); //800 pixel width, 600 pixel tall
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();

        win.add(canvas);
        win.setVisible(true);

    }
}