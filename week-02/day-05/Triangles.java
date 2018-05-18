import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles{


    public static void mainDraw(Graphics graphics) {

        //int

        int[] xPoints = {197, 200, 203};
        int[] yPoints = {196, 200, 196};
        graphics.drawPolygon(xPoints, yPoints, 3);

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