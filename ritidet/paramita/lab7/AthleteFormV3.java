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