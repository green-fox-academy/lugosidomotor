import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

    public static void mainDraw(Graphics graphics){

        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.


        for (int i = 0; i < 1000; i++) {

            int x = (int)(Math.random() * 500);
            int y = (int)(Math.random() * 500);
            int size = (int)(Math.random() * 4);
            int starter = 20;
            drawLines(x,y,size, graphics);
        }
    }

    public static void drawLines (int x, int y, int size, Graphics graphics) {

            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, size, size);
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