package ritidet.paramita.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV2 extends AthleteForm {
    protected JLabel nationality, sport, bio;
    protected JTextArea bioTextArea;
    protected JScrollPane bioScrollPane;
    protected JPanel midPanel, bioPanel, comboBoxPanel, jlistPanel;
    protected JComboBox<String> nationality_box;
    protected JList<String> sport_Jlist;
    protected String[] nationality_list = { "American", "Chinese", "Indonesian", "Japanese", "Thai", "Vietnamese" };
    protected String[] sport_list = { "Badminton", "Boxing", "Football", "Running" };

    public AthleteFormV2(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV2 msw = new AthleteFormV2("Athlete Form V2");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();
        nationality = new JLabel("Nationality :");
        sport = new JLabel("Sport :");
        bio = new JLabel("Bio :");
        nationality_box = new JComboBox<>(nationality_list);
        nationality_box.setSelectedIndex(4);
        sport_Jlist = new JList<>(sport_list);
        sport_Jlist.setSelectedIndex(2);
        bioTextArea = new JTextArea(5, 0);
        bioScrollPane = new JScrollPane(bioTextArea);
        bioPanel = new JPanel(new BorderLayout());
        bioPanel.add(bio, BorderLayout.NORTH);
        bioPanel.add(bioScrollPane, BorderLayout.SOUTH);
        comboBoxPanel = new JPanel(new GridLayout(1, 2));
        comboBoxPanel.add(nationality);
        comboBoxPanel.add(nationality_box);
        jlistPanel = new JPanel(new GridLayout(1, 2));
        jlistPanel.add(sport);
        jlistPanel.add(sport_Jlist);
        midPanel = new JPanel(new BorderLayout());
        midPanel.add(comboBoxPanel, BorderLayout.NORTH);
        midPanel.add(jlistPanel);
        midPanel.add(bioPanel, BorderLayout.SOUTH);
        mainPanel.add(midPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}