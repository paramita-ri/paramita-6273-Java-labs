/*
 * AthleteFormV13 program is program that extends from AthleteFormV12
 * The title of the program is set to “Athlete Form V13”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 March 2023
 */
package ritidet.paramita.lab10;

import javax.swing.*;

public class AthleteFormV13 extends AthleteFormV12 {
    protected int weight, height;
    protected final double MAX_WEIGHT = 200, MAX_HEIGHT = 300;

    public AthleteFormV13(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV13 msw = new AthleteFormV13("Athlete Form V13");// Show title "Athlete Form V13"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }

    // Method for chech that data of weight and height is correct
    public int getValidNumber(JTextField textField, String data, double maxValue) {
        try {
            String strFromTxtF = textField.getText();
            double numFormTxtF = Double.parseDouble(strFromTxtF);
            if (numFormTxtF > 0 && numFormTxtF <= maxValue && (strFromTxtF.equalsIgnoreCase("f" + "d"))) {// if number
                                                                                                          // from user
                                                                                                          // in range
                                                                                                          // (0,
                                                                                                          // maxvalue]
                                                                                                          // and don't
                                                                                                          // have f or d
                                                                                                          // in number
                return 1;// return 1
            } else if (numFormTxtF > 0 && numFormTxtF <= maxValue && !strFromTxtF.equalsIgnoreCase("f" + "d")) {// if
                                                                                                                // number
                                                                                                                // from
                                                                                                                // user
                                                                                                                // in
                                                                                                                // range
                                                                                                                // (0,
                                                                                                                // maxvalue]
                                                                                                                // and
                                                                                                                // have
                                                                                                                // f or
                                                                                                                // d in
                                                                                                                // number
                JOptionPane.showMessageDialog(this, "Please enter a valid number for " + data);// showMessageDialog
                                                                                               // "Please enter a valid
                                                                                               // number for " + data
                return -1;// return -1
                // The need to write the condition like this because if not entered, the program
                // will count that
                // the f and d after the number are double and float variables.
            } else if (numFormTxtF > maxValue) {// if number from user greater than maxValue
                JOptionPane.showMessageDialog(this, data + " should be less than " + maxValue);// showMessageDialog data
                                                                                               // + " should be less
                                                                                               // than " + maxValue
                return -1;// return -1
            } else {// if number from user less than 0 or it is a 0
                JOptionPane.showMessageDialog(this, data + " should be greater than 0");// showMessageDialog data + "
                                                                                        // should be greater than 0"
                return -1;// return -1
            }
        } catch (Exception e) {// if data from user is not number then
            JOptionPane.showMessageDialog(this, "Please enter a valid number for " + data);// showMessageDialog "Please
                                                                                           // enter a valid number for "
                                                                                           // + data
            return -1;// return -1
        }
    }

    // Override method addAthlete
    public void addAthlete() {
        weight = getValidNumber(weightField, "Weight", MAX_WEIGHT);// get value that return form
                                                                   // getValidNumber(weightField, "Weight", MAX_WEIGHT)
                                                                   // in weight
        if (weight == -1)// value is -1 it mean data from user incorrect
            return;// stop the program execution
        height = getValidNumber(heightField, "Height", MAX_HEIGHT);// get value that return form
                                                                   // getValidNumber(weightField, "Weight", MAX_WEIGHT)
                                                                   // in height
        if (height == -1)// value is -1 it mean data from user incorrect
            return;// stop the program execution
        else {// value is 1 it mean data from user correct
            super.addAthlete();// Call medthod addAthlete() from AthleteFormV11
        }
    }

    // Main method for run program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}