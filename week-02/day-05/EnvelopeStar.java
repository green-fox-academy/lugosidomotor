import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar{

    public static void mainDraw(Graphics graphics){

        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int x = 10;

        drawLinesQ1(x, graphics);
        drawLinesQ2(x, graphics);
        drawLinesQ3(x, graphics);
        drawLinesQ4(x, graphics);

    }

    public static void drawLinesQ1 (int x, Graphics graphics) {

        int xStart = 250;
        int yStart = 10;

        int xEnd = 250;
        int yEnd = 250;
        int lineNumber = 16;

        for (int i = 0; i < 16; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(xStart,yStart,xEnd,yEnd);

            yStart = yStart + 250/lineNumber;
            xEnd = xEnd - 250/lineNumber;
        }
    }

    public static void drawLinesQ2 (int x, Graphics graphics) {

        int xStart = 250;
        int yStart = 10;

        int xEnd = 250;
        int yEnd = 250;
        int lineNumber = 16;

        for (int i = 0; i < 16; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(xStart,yStart,xEnd,yEnd);

            yStart = yStart + 250/lineNumber;
            xEnd = xEnd + 250/lineNumber;
        }
    }

    public static void drawLinesQ3 (int x, Graphics graphics) {

        int xStart = 250;
        int yStart = 250;

        int xEnd = 250;
        int yEnd = 490;
        int lineNumber = 16;

        for (int i = 0; i < 16; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(xStart,yStart,xEnd,yEnd);

            xStart = xStart - 250/lineNumber;
            yEnd = yEnd - 250/lineNumber;
        }
    }

    public static void drawLinesQ4 (int x, Graphics graphics) {

        int xStart = 250;
        int yStart = 250;

        int xEnd = 250;
        int yEnd = 490;
        int lineNumber = 16;

        for (int i = 0; i < 16; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(xStart,yStart,xEnd,yEnd);

            xStart = xStart + 250/lineNumber;
            yEnd = yEnd - 250/lineNumber;
        }
    }

    static int WIDTH = 500;
    static int HEIGHT = 526;
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