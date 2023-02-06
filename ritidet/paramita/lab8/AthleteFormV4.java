package ritidet.paramita.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV4 extends ritidet.paramita.lab7.AthleteFormV3 {
    protected JLabel hobbies, labelOfSlider;
    protected JCheckBox reading, gardening, watchingMovies, shopping, others;
    protected JSlider yearSlider;
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
        hobbies = new JLabel("Hobbies:");
        labelOfSlider = new JLabel("Year of experience in this sport:");
        reading = new JCheckBox("Reading", false);
        gardening = new JCheckBox("Gardening", false);
        watchingMovies = new JCheckBox("Watching Movies", true);
        shopping = new JCheckBox("Shopping", false);
        others = new JCheckBox("Others", false);
        yearSlider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        yearSlider.setMinorTickSpacing(1);  
        yearSlider.setMajorTickSpacing(5);
        yearSlider.setPaintTicks(true);  
        yearSlider.setPaintLabels(true);
        checkBoxPanel = new JPanel();
        checkBoxPanel.add(reading);
        checkBoxPanel.add(gardening);
        checkBoxPanel.add(watchingMovies);
        checkBoxPanel.add(shopping);
        checkBoxPanel.add(others);
        hobbiesPanel = new JPanel(new BorderLayout());
        hobbiesPanel.add(hobbies, BorderLayout.NORTH);
        hobbiesPanel.add(checkBoxPanel, BorderLayout.SOUTH);
        sliderPanel = new JPanel(new BorderLayout());
        sliderPanel.add(labelOfSlider, BorderLayout.NORTH);
        sliderPanel.add(yearSlider, BorderLayout.SOUTH);
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
