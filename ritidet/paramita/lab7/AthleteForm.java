/*
 * AthleteForm program is program that extends from MySimpleWindow 
 * The title of the program is set to “Athlete Form”
 * There are new JRadioButton: maleButton, femaleButton for craete button for genderlabel.
 * There are new JLabel: nameLabel, weightLabel, heightLabel, birthDateLabel, genderLabel for text on left.
 * There are JTextField nameField, weightField, heightField, birthDateField for text arae on right.
 * and JPanel topPanel, buttonGenderPanel for add new object that add by override method addComponents()
 * Has method protected void setFrameFeatures() which performs like method setFrameFeatures() in MySimpleWindow
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 31 Janruary 2023
 */
package ritidet.paramita.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteForm extends MySimpleWindow {
    protected JRadioButton maleButton, femaleButton;
    protected JLabel nameLabel, weightLabel, heightLabel, birthDateLabel, genderLabel;
    protected JTextField nameField, weightField, heightField, birthDateField;
    protected JPanel topPanel, buttonGenderPanel;

    public AthleteForm(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteForm msw = new AthleteForm("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();
        nameLabel = new JLabel("Name :");//create nameLabel
        weightLabel = new JLabel("Weight :");//create weightLabel
        heightLabel = new JLabel("Height :");//create heightLabel
        birthDateLabel = new JLabel("Date of Birth (dd-mm-yyy) :");//create birthDateLabel
        genderLabel = new JLabel("Gender :");//create genderLabel
        nameField = new JTextField(15);//create nameField by lenght 15  
        weightField = new JTextField(15);//create weightField by lenght 15  
        heightField = new JTextField(15);//create heightField by lenght 15  
        birthDateField = new JTextField(15);//create birthDateField by lenght 15  
        maleButton = new JRadioButton("Male", false);//create maleButton
        femaleButton = new JRadioButton("Female", false);//create femaleButton
        ButtonGroup buttonGenderGroup = new ButtonGroup();//create buttonGenderGroup
        buttonGenderGroup.add(maleButton);//add maleButton in buttonGenderGroup
        buttonGenderGroup.add(femaleButton);//add femaleButton in buttonGenderGroup
        buttonGenderPanel = new JPanel();//create buttonGenderPanel
        buttonGenderPanel.add(maleButton);//add maleButton in buttonGenderPanel
        buttonGenderPanel.add(femaleButton);//add femaleButton in buttonGenderPanel
        topPanel = new JPanel(new GridLayout(5, 2));//create topPanel that separate by 5 row 2 column
        topPanel.add(nameLabel);//add nameLabel to topPanel
        topPanel.add(nameField);//add nameField to topPanel
        topPanel.add(weightLabel);//add weightLabel to topPanel
        topPanel.add(weightField);//add weightField to topPanel
        topPanel.add(heightLabel);//add heightLabel to topPanel
        topPanel.add(heightField);//add heightField to topPanel
        topPanel.add(birthDateLabel);//add birthDateLabel to topPanel
        topPanel.add(birthDateField);//add birthDateField to topPanel
        topPanel.add(genderLabel);//add genderLabel to topPanel
        topPanel.add(buttonGenderPanel);//add buttonGenderPanel to topPanel
        mainPanel.setLayout(new BorderLayout());//setLayout of mainPanel by BorderLayout
        mainPanel.add(topPanel, BorderLayout.NORTH);//add topPanel to NORTH of mainPanel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);//add buttonPanel to SOUTH of mainPanel
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}