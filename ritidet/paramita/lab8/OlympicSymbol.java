/*
 * OlympicSymbol program is class that extends from JPanel
 * this program is create for draw OlympicSymbol that have five rings that have same size in different color.
 * the colors are: blue, red, yellow, green, black 
 * the size of the rings are: 50 in width and 50 in height 
 * setStroke of the line by: 5
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 Febuary 2023
 */
package ritidet.paramita.lab8;

import java.awt.*;
import javax.swing.*;

public class OlympicSymbol extends JPanel {
    protected int x_firstCircle, y_firstCircle, width, height;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(5));
        x_firstCircle = 10;
        y_firstCircle = 10;
        width = 50;
        height = 50;
        g.setColor(Color.BLUE);
        g.drawOval(x_firstCircle, y_firstCircle, width, height);
        g.setColor(Color.RED);
        g.drawOval(x_firstCircle + 50, y_firstCircle, width, height);
        g.setColor(Color.YELLOW);
        g.drawOval(x_firstCircle + 100, y_firstCircle, width, height);
        g.setColor(Color.GREEN);
        g.drawOval(x_firstCircle + 25, y_firstCircle + 25, width, height);
        g.setColor(Color.BLACK);
        g.drawOval(x_firstCircle + 75, y_firstCircle + 25, width, height);
    }
}
