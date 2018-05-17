import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {

        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.



        for (int i = 0; i < 50; i++) {

            //System.out.printf("X kordináta?");
            //Scanner scannerA = new Scanner(System.in);
            //int x = scannerA.nextInt();
            //System.out.printf("Y kordináta?");
            //Scanner scannerB = new Scanner(System.in);
            //int y = scannerB.nextInt();

            int x = (int)(Math.random() * 500);
            int y = (int)(Math.random() * 500);

            drawLines(x, y, graphics);
        }
    }



    public static void drawLines (int xC, int yC, Graphics graphics) {

        graphics.setColor(Color.PINK);
        graphics.drawLine(xC, yC, 250, 250);
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