/*
 * AthleteFormV6 program is program that extends from AthleteFormV5
 * The title of the program is set to “Athlete Form V6”
 * That have method setFrameFeatures() and addMenus() like AthleteFormV5
 * but have new variables by adding those variables by override method addComponents() 
 * There are new OlympicSymbol: olympicSymbol the variable is an instance of the class OlympicSymbol
 * set the size of the instance to at 200 in width and 100 in height.
 * There are new JPanel: olympicSymbolPanel, centerPanel, northPanel to collect new variable olympicSymbol and old variable to change and 
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

public class AthleteFormV6 extends AthleteFormV5 {
    protected OlympicSymbol olympicSymbol;
    protected JPanel olympicSymbolPanel, centerPanel, northPanel;

    public AthleteFormV6(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV6 msw = new AthleteFormV6("Athlete Form V6");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();
        olympicSymbol = new OlympicSymbol();
        olympicSymbol.setPreferredSize(new Dimension(200, 100));
        olympicSymbolPanel = new JPanel(new BorderLayout());
        olympicSymbolPanel.add(olympicSymbol, BorderLayout.WEST);
        olympicSymbol.setBackground(Color.WHITE);
        northPanel = new JPanel(new BorderLayout());
        northPanel.add(olympicSymbolPanel, BorderLayout.WEST);
        northPanel.setBackground(Color.WHITE);
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(topPanel, BorderLayout.NORTH);
        centerPanel.add(newMidPanel, BorderLayout.CENTER);
        centerPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}