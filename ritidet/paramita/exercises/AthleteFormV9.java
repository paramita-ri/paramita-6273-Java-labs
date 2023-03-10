package ritidet.paramita.exercises;

import java.awt.event.*;
import javax.swing.*;

public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {
    public String stateGenderBT;

    public AthleteFormV9(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV9 msw = new AthleteFormV9("Athlete Form V9");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public void itemStateChanged(ItemEvent e) {
        JRadioButton genderSelected = (JRadioButton) e.getItemSelectable();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            stateGenderBT = "Gender: "+genderSelected.getText() + newline;
        }
    } 
    

    public void addComponents() {
        super.addComponents();
        maleButton.addItemListener(this);
        femaleButton.addItemListener(this);
    }

    public void getUserValues() {
        super.getUserValues();
        showMessage = showMessage + stateGenderBT;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}