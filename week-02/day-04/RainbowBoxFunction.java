import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){

        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.




        for (int i = 0; i < 1000; i++) {

            //int x = (int)(Math.random() * 400);
            //int y = (int)(Math.random() * 400);
            int size = (int)(Math.random() * 400);
            int color = (int)(Math.random() * 256);

            drawLines(size, color, graphics);
        }
    }

    public static void drawLines (int size, int color, Graphics graphics) {

        graphics.setColor(new Color(color,color,color,250));
        graphics.fillRect( (int)(Math.random() * 1000),(int)(Math.random() * 1000),size,size );
    }












    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}