/*
 * MySimpleWindow program is program that extends from class JFrame 
 * There are three variables for three buttons whose names are “Cancel”, “Reset” and “Submit”. 
 * These buttons should be protected.
 * There are two panels, the main panel and the panel for the button. Similarly, 
 * these panels should be protected.
 * Implement method protected void setFrameFeatures() which performs the following tasks
 * Set the window located at the center of the screen.
 * Set the window visible.
 * Exit the application using the System exit method when the user initiates a "close" on this frame.
 * Set the size of the window appropriate for all the components.
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 31 Janruary 2023
 */
package ritidet.paramita.lab7;

import javax.swing.*;

public class AthleteFormV3 extends AthleteFormV2 {
    protected JMenuBar menuBar;
    protected JMenu file, config, color, size;
    protected JMenuItem newMenu, open, save, exit, red, green, blue, size16, size20, size24;
    protected ImageIcon newImageIcon, openImageIcon, saveImageIcon;

    public AthleteFormV3(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV3 msw = new AthleteFormV3("Athlete Form V3");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();     
    }

    protected void addMenus() {
        file = new JMenu("File");
        newImageIcon = new ImageIcon("images/New-icon.png");
        openImageIcon = new ImageIcon("images/Open-icon.png");
        saveImageIcon = new ImageIcon("images/Save-icon.png");
        newMenu = new JMenuItem("New", newImageIcon);
        open = new JMenuItem("Open", openImageIcon);
        save = new JMenuItem("Save", saveImageIcon);
        exit = new JMenuItem("Exit");
        file.add(newMenu);
        file.add(open);
        file.add(save);
        file.add(exit);
        config = new JMenu("Config");
        color = new JMenu("Color");
        size = new JMenu("Size");
        red = new JMenuItem("Red");
        green = new JMenuItem("Green");
        blue = new JMenuItem("Blue");
        size16 = new JMenuItem("16");
        size20 = new JMenuItem("20");
        size24 = new JMenuItem("24");
        color.add(red);
        color.add(green);
        color.add(blue);
        size.add(size16);
        size.add(size20);
        size.add(size24);
        config.add(color);
        config.add(size);
        menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(config);
        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}