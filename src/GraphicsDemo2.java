import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo2 extends Canvas {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        // 相同y上分别化一个长方形和椭圆形
        g.drawRect(50, 20, 100, 200);
        g.drawOval(160, 20, 100, 200);
        // 画一个270度的形状, 有个缺口的椭圆
        g.drawArc(270, 20, 100, 200, 0, 270);
        // 画一个1/4的圆, 1/8的圆
        g.drawArc(50, 250, 150, 150, 90, 180);
        g.drawArc(210,250,150,150,45,90);
        // draw和fill有什么不一样, 同一横轴, 上下有两个不同的1/8的圆
        // 程序运行的结果是一条弧线, 所以fill是将点变成一个图形并涂满颜色, draw只是将点都连起来
        g.fillArc(220,280,150,150,45,90);
        g.drawString("difference between fillArc and drawArc.", 220, 280);
        // 画一个黄色的315度的圆, 打豆豆里的那个黄色的圆
        g.setColor(Color.yellow);
        g.fillArc(150, 400, 150, 150, 45, 270);
        // hw2
        // Draw a second, slightly smaller pacman to the right of the first pacman. 
        // Make her face to the left and make her pink. 
        g.setColor(Color.pink);
        g.fillArc(300, 400, 100, 100, 225, 300);
        // 设定一个叫myOrange的颜色
        Color myOrange = new Color(230,92,0);
        // 画一个myOrange颜色的圆
        g.setColor(myOrange);
        // 为什么这个圆中间会有缺口? 因为myGrey中的数值没有超过myOrange的圆的范围
        g.fillOval(500,50,150,150);
        // 画一个myGrey颜色的圆
        Color myGrey = new Color(238,238,238);
        g.setColor(myGrey);
        g.fillOval(550,100,50,50);
        // 画一个黄色的椭圆
        Color myColor = new Color(53, 217, 98);
        g.setColor(myColor);
        g.fillOval(500,210,150,150);
        // 画一个绿色的椭圆
        g.setColor(Color.green);
        g.fillOval(500,370,150,150);
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("GraphicsDemo2: Arcs and colors");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo2 canvas = new GraphicsDemo2();
        win.add(canvas);
        win.setVisible(true);
    }
}