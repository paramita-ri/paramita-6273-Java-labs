/*
 * AthleteFormV2 program is program that extends from AthleteForm
 * The title of the program is set to “Athlete Form V2”
 * There are new JTextArea bioTextArea and JScrollPane bioScrollPane for craete text area under bioLabel label 
 * There are new JLabel nationalityLabel, sportLabel, bioLabel for text on left.
 * There are new JComboBox<String> nationality_box and JList<String> sport_Jlist to collect and shoe list of 
 * nationalityLabel and sportLabel that is stored in nationality_list and sport_list
 * and JPanel midPanel, bioPanel, comboBoxPanel, jlistPanel for add new object that add by override method addComponents()
 * Has method protected void setFrameFeatures() which performs like method setFrameFeatures() in MySimpleWindow
 * 
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 31 Janruary 2023
 */
package ritidet.paramita.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV2 extends AthleteForm {
    protected JLabel nationalityLabel, sportLabel, bioLabel;
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
        nationalityLabel = new JLabel("Nationality :");//create nationalityLabel
        sportLabel = new JLabel("Sport :");//create sportLabel
        bioLabel = new JLabel("Bio :");//create bioLabel
        nationality_box = new JComboBox<>(nationality_list);//create nationality_box
        nationality_box.setSelectedIndex(4);//set show at index 4 "Thai" 
        sport_Jlist = new JList<>(sport_list);//create sport_Jlist
        sport_Jlist.setSelectedIndex(2);//set show at index 2 "Football" 
        bioTextArea = new JTextArea(5, 0);//create bioTextArea that has 5 row,0 column
        bioScrollPane = new JScrollPane(bioTextArea);//create bioScrollPane
        bioPanel = new JPanel(new BorderLayout());//create bioPanel that set layout by BorderLayout
        bioPanel.add(bioLabel, BorderLayout.NORTH);//add bioLabel to NORTH of bioPanel
        bioPanel.add(bioScrollPane, BorderLayout.SOUTH);//add bioLabel to NORTH of bioPanel
        comboBoxPanel = new JPanel(new GridLayout(1, 2));//create that separate by 1 row 2 column
        comboBoxPanel.add(nationalityLabel);//add nationalityLabel to comboBoxPanel
        comboBoxPanel.add(nationality_box);//add nationality_box to comboBoxPanel
        jlistPanel = new JPanel(new GridLayout(1, 2));//create that separate by 1 row 2 column
        jlistPanel.add(sportLabel);//add sportLabel to jlistPanel
        jlistPanel.add(sport_Jlist);//add sport_Jlist to jlistPanel
        midPanel = new JPanel(new BorderLayout());//create that set layout by BorderLayout
        midPanel.add(comboBoxPanel, BorderLayout.NORTH);//add comboBoxPanel to NORTH of midPanel
        midPanel.add(jlistPanel);//add jlistPanel to midPanel
        midPanel.add(bioPanel, BorderLayout.SOUTH);//add bioPanel to NORTH of midPanel
        mainPanel.add(midPanel, BorderLayout.CENTER);//add midPanel to NORTH of mainPanel
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}