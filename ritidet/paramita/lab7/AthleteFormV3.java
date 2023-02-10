/*
 * AthleteFormV3 program is program that extends from AthleteFormV2
 * The title of the program is set to “Athlete Form V3”
 * That have method addComponents() and setFrameFeatures() like AthleteFormV2
 * but has new addMenus() method to create menu bar
 * There are new JMenuBar: menuBar to create menu bar
 * There are new JMenu: fileMenu, configMenu is a main meun colorMenu, sizeMenu is a submenu of configMenu
 * There are new JMenuItem: newMenuItem, openItem, saveItem, exitItem is item in fileMenu redItem,greenItem, blueItem
 * There are new ImageIcon: newImageIcon, openImageIcon, saveImageIcon for collect image icon for fileMenu
 * 
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
    protected JMenu fileMenu, configMenu, colorMenu, sizeMenu;
    protected JMenuItem newMenuItem, openItem, saveItem, exitItem, redItem,
    greenItem, blueItem, size16Item, size20Item, size24Item;
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
        fileMenu = new JMenu("File");
        newImageIcon = new ImageIcon("images/New-icon.png");
        openImageIcon = new ImageIcon("images/Open-icon.png");
        saveImageIcon = new ImageIcon("images/Save-icon.png");
        newMenuItem = new JMenuItem("New", newImageIcon);
        openItem = new JMenuItem("Open", openImageIcon);
        saveItem = new JMenuItem("Save", saveImageIcon);
        exitItem = new JMenuItem("Exit");
        fileMenu.add(newMenuItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        configMenu = new JMenu("Config");
        colorMenu = new JMenu("Color");
        sizeMenu = new JMenu("Size");
        redItem = new JMenuItem("Red");
        greenItem = new JMenuItem("Green");
        blueItem = new JMenuItem("Blue");
        size16Item = new JMenuItem("16");
        size20Item = new JMenuItem("20");
        size24Item = new JMenuItem("24");
        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);
        sizeMenu.add(size16Item);
        sizeMenu.add(size20Item);
        sizeMenu.add(size24Item);
        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
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