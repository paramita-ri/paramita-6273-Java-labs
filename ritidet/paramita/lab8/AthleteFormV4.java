/*
 * AthleteFormV4 program is program that extends from AthleteFormV3
 * The title of the program is set to “Athlete Form V3”
 * That have method addMenus() and setFrameFeatures() like AthleteFormV3
 * but have new variables by adding those variables by override method addComponents()
 * There are new JLabel: hobbiesLabel, yearExperienceLabel to create a text "Hobbies:" and "Year of experience in this sport:".
 * There are new JCheckBox: readingCheckBox, gardeningCheckBox, watchingMoviesCheckBox, shoppingCheckBox, othersCheckBox
 * to create a check box of hobbies.
 * There are new JSlider: yearExperienceSlider to create a slider of year experience in sport that have min 0 and max 20.
 * There are new JPanel: checkBoxPanel, hobbiesPanel, sliderPanel, newMidPanel to collect new item in new panel.
 * 
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 Febuary 2023
 */
package ritidet.paramita.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV4 extends ritidet.paramita.lab7.AthleteFormV3 {
    protected JLabel hobbiesLabel, yearExperienceLabel;
    protected JCheckBox readingCheckBox, gardeningCheckBox, watchingMoviesCheckBox, shoppingCheckBox, othersCheckBox;
    protected JSlider yearExperienceSlider;
    protected JPanel checkBoxPanel, hobbiesPanel, sliderPanel, newMidPanel;

    public AthleteFormV4(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV4 msw = new AthleteFormV4("Athlete Form V4");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();
        hobbiesLabel = new JLabel("Hobbies:");
        yearExperienceLabel = new JLabel("Year of experience in this sport:");
        readingCheckBox = new JCheckBox("Reading", false);
        gardeningCheckBox = new JCheckBox("Gardening", false);
        watchingMoviesCheckBox = new JCheckBox("Watching Movies", true);
        shoppingCheckBox = new JCheckBox("Shopping", false);
        othersCheckBox = new JCheckBox("Others", false);
        yearExperienceSlider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        yearExperienceSlider.setMinorTickSpacing(1);
        yearExperienceSlider.setMajorTickSpacing(5);
        yearExperienceSlider.setPaintTicks(true);
        yearExperienceSlider.setPaintLabels(true);
        checkBoxPanel = new JPanel();
        checkBoxPanel.add(readingCheckBox);
        checkBoxPanel.add(gardeningCheckBox);
        checkBoxPanel.add(watchingMoviesCheckBox);
        checkBoxPanel.add(shoppingCheckBox);
        checkBoxPanel.add(othersCheckBox);
        hobbiesPanel = new JPanel(new BorderLayout());
        hobbiesPanel.add(hobbiesLabel, BorderLayout.NORTH);
        hobbiesPanel.add(checkBoxPanel, BorderLayout.SOUTH);
        sliderPanel = new JPanel(new BorderLayout());
        sliderPanel.add(yearExperienceLabel, BorderLayout.NORTH);
        sliderPanel.add(yearExperienceSlider, BorderLayout.SOUTH);
        newMidPanel = new JPanel(new BorderLayout());
        newMidPanel.add(hobbiesPanel, BorderLayout.NORTH);
        newMidPanel.add(midPanel, BorderLayout.CENTER);
        newMidPanel.add(sliderPanel, BorderLayout.SOUTH);
        mainPanel.add(newMidPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}