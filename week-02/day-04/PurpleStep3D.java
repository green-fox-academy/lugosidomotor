import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleStep3D {

    public static void mainDraw(Graphics graphics){

        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.




        for (int i = 0; i < 1; i++) {

            //int x = (int)(Math.random() * 400);
            //int y = (int)(Math.random() * 400);
            //int size = (int)(Math.random() * 400);
            int starter = 20;
            int size = 30;

            drawLines(starter,size, graphics);
        }
    }

    public static void drawLines (int starter, int size, Graphics graphics) {
        for (int i = 1; i < 15; i++) {

            graphics.setColor(Color.BLACK);
            graphics.drawRect(i * size, i * size, size, size);
            graphics.setColor(Color.pink);
            graphics.fillRect(i * size + 1, i * size + 1, size - 1, size - 1);


        }
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