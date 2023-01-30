package ritidet.paramita.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteForm extends MySimpleWindow {
    protected JRadioButton male, female;
    protected JLabel name, weight, height, birthDate, gender;
    protected JTextField field1, field2, field3, field4;
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
        name = new JLabel("Name :");
        weight = new JLabel("Weight :");
        height = new JLabel("Height :");
        birthDate = new JLabel("Date of Birth (dd-mm-yyy) :");
        gender = new JLabel("Gender :");
        field1 = new JTextField(15);
        field2 = new JTextField(15);
        field3 = new JTextField(15);
        field4 = new JTextField(15);
        male = new JRadioButton("Male", false);
        female = new JRadioButton("Female", false);
        ButtonGroup buttonGenderGroup = new ButtonGroup();
        buttonGenderGroup.add(male);
        buttonGenderGroup.add(female);
        buttonGenderPanel = new JPanel();
        buttonGenderPanel.add(male);
        buttonGenderPanel.add(female);
        topPanel = new JPanel(new GridLayout(5, 2));
        topPanel.add(name);
        topPanel.add(field1);
        topPanel.add(weight);
        topPanel.add(field2);
        topPanel.add(height);
        topPanel.add(field3);
        topPanel.add(birthDate);
        topPanel.add(field4);
        topPanel.add(gender);
        topPanel.add(buttonGenderPanel);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}