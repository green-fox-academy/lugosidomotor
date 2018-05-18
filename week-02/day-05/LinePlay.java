import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay{

    public static void mainDraw(Graphics graphics){

        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int x = 10;

            drawLinesUp(x, graphics);
            drawLinesBottom(x, graphics);

        }

    public static void drawLinesUp (int x, Graphics graphics) {

        int xStart = 30;
        int yStart = 5;

        int xEnd = 490;
        int yEnd = 30;
        int lineNumber = 15;

        for (int i = 0; i < 15; i++) {

        graphics.setColor(Color.RED);
        graphics.drawLine(xStart,yStart,xEnd,yEnd);

        xStart = xStart + 460/lineNumber;
        yEnd = yEnd + 460/lineNumber;
        }
    }
    public static void drawLinesBottom (int x, Graphics graphics) {

        int xStart = 5;
        int yStart = 470;
        int xEnd = 490;
        int yEnd = 470;
        int lineNumber = 15;

        for (int i = 0; i < 15; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(xStart,yStart,xEnd,yEnd);

            yStart = yStart - 460/lineNumber;
            xEnd = xEnd - 460/lineNumber;
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