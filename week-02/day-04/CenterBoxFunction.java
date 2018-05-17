import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){

        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.




        for (int i = 0; i < 10; i++) {

            //int x = (int)(Math.random() * 400);
            //int y = (int)(Math.random() * 400);
            int size = (int)(Math.random() * 400);

            drawLines(size, graphics);
        }
    }

    public static void drawLines (int size, Graphics graphics) {

        graphics.setColor(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255),250));
        graphics.drawRect( 250 -(size/2),250 -(size/2),size,size );
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