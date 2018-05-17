import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics){

        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.PINK);
        graphics.drawLine(100, 100, 100, 400);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(100, 100, 400, 100);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(100, 400, 400, 400);
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(400, 100, 400, 400);


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}