package ritidet.paramita.lab10;

import ritidet.paramita.lab9.AthleteFormV10;
import ritidet.paramita.lab6.AthleteV2;
import ritidet.paramita.lab5.Athlete.Gender;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.SwingUtilities;

public class AthleteFormV11 extends AthleteFormV10{
    protected Font menuFont = new Font("Serif", Font.BOLD, 14);
    protected JMenu dataMenu, sortMenu;
    protected JMenuItem addMI, displayMI, clearMI, searchMI, byNameMI, byHeightMI, byHWMI;
    public AthleteFormV11(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV11 msw = new AthleteFormV11("Athlete Form V10");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    public void addMenus(){
        super.addMenus();
        dataMenu = new JMenu("Data");
        sortMenu = new JMenu("Sort");
        addMI =  new JMenuItem("Add");
        displayMI =  new JMenuItem("Display");
        clearMI =  new JMenuItem("Clear");
        searchMI =  new JMenuItem("Search");
        byNameMI =  new JMenuItem("By Name");
        byHeightMI =  new JMenuItem("By Height");
        byHWMI =  new JMenuItem("By Height and Weight");
        dataMenu.add(addMI);
        dataMenu.add(displayMI);
        dataMenu.add(clearMI);
        dataMenu.add(searchMI);
        dataMenu.add(sortMenu);
        sortMenu.add(byNameMI);
        sortMenu.add(byHeightMI);
        sortMenu.add(byHWMI);
        menuBar.add(dataMenu);
        dataMenu.setFont(menuFont);
        sortMenu.setFont(menuFont);
        addMI.setFont(menuFont);
        displayMI.setFont(menuFont);
        clearMI.setFont(menuFont);
        searchMI.setFont(menuFont);
        byNameMI.setFont(menuFont);
        byHeightMI.setFont(menuFont);
        byHWMI.setFont(menuFont);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
