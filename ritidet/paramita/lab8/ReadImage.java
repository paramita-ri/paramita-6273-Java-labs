/*
 * ReadImage program is class that extends from JPanel
 * this program is create for Read Image flie that locate on "images/Athlete.png" and displav this image
 * the colors are: blue, red, yellow, green, black 
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 Febuary 2023
 */
package ritidet.paramita.lab8;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ReadImage extends JPanel {
    protected BufferedImage image;
    String athleteimage = "images/Athlete.png";

    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    public ReadImage() {
        try {
            image = ImageIO.read(new File(athleteimage));
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
