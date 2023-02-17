/*
 * AthleteFormV7 program is program that extends from AthleteFormV6
 * The title of the program is set to “Athlete Form V7”
 * That have method setFrameFeatures() and addMenus() like AthleteFormV6
 * but have new variables by adding those variables by override method addComponents() 
 * There are new ReadImage: olympicImage the variable is an instance of the class ReadImage
 * set the size of the instance to at 500 in width and 250 in height.
 * Use this size because it's just the right size and won't lose other parameters when it's full screen.
 * There are new JPanel: imagPanel, southPanell to collect new variable olympicSymbol and old variable to change and 
 * manage the old panel to be more systematic.
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 Febuary 2023
 */
package ritidet.paramita.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV7 extends AthleteFormV6 {
    protected ReadImage olympicImage;
    protected JPanel imagPanel, southPanel;

    public AthleteFormV7(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV7 msw = new AthleteFormV7("Athlete Form V7");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();
        olympicImage = new ReadImage();
        olympicImage.setPreferredSize(new Dimension(500, 270));
        imagPanel = new JPanel();
        imagPanel.add(olympicImage);
        southPanel = new JPanel(new BorderLayout());
        southPanel.add(imagPanel, BorderLayout.NORTH);
        southPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
