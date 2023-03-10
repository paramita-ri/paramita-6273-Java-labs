/*
 * AthleteFormV8 program is program that extends from AthleteFormV7
 * The title of the program is set to “Athlete Form V8”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 27 Febuary 2023
 */
package ritidet.paramita.lab9;

import ritidet.paramita.lab8.AthleteFormV6;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.SwingUtilities;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    protected String nameMes, weightMes, heightMes, birthDateMes, textFeildMes, resultTxt, genderMes, hobbieMes,
            stateGenderBT, stateHobbiesBT;
    protected ArrayList<JTextField> textFieldList = new ArrayList<JTextField>();// ArrayList for text feild.
    protected ArrayList<JCheckBox> checkBoxsList = new ArrayList<JCheckBox>();// ArrayList for check box.

    public AthleteFormV8(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV8 msw = new AthleteFormV8("Athlete Form V8");
        msw.addComponents();// Add Components
        msw.initValues();// Set the initial value of the variable.
        msw.addMenus();// Add menus
        msw.addListeners();// Add Listeners
        msw.setFrameFeatures();// Set Frame
    }

    // Method for Add Components
    protected void addComponents() {
        super.addComponents();// Call method addComponents() from AthleteFormV6
        textFieldList.add(nameField);// Add nameField in textFieldList
        textFieldList.add(weightField);// Add weightField in textFieldList
        textFieldList.add(heightField);// Add heightField in textFieldList
        textFieldList.add(birthDateField);// Add birthDateField in textFieldList
        checkBoxsList.add(readingCheckBox);// Add readingCheckBox in checkBoxsList
        checkBoxsList.add(gardeningCheckBox);// Add gardeningCheckBox in checkBoxsList
        checkBoxsList.add(watchingMoviesCheckBox);// Add watchingMoviesCheckBox in checkBoxsList
        checkBoxsList.add(shoppingCheckBox);// Add shoppingCheckBox in checkBoxsList
        checkBoxsList.add(othersCheckBox);// Add othersCheckBox in checkBoxsList
    }

    // Method for set text feild background
    protected void setTFBGColor(Color color) {
        nameField.setBackground(color);// set nameField background color.
        weightField.setBackground(color);// set weightField background color.
        heightField.setBackground(color);// set heightField background color.
        birthDateField.setBackground(color);// set birthDateField background color.
    }

    // Method for add Listener
    protected void addListeners() {
        submitButton.addActionListener(this);// add ActionListener to the submit button
        cancelButton.addActionListener(this);// add ActionListener to the cancel button
        resetButton.addActionListener(this);// add ActionListener to the reset button
    }

    // Method for Set the initial value of the variable.
    protected void initValues() {
        setTFBGColor(Color.PINK);// set text field background color to pink
        nameField.setText("Paramita");// set text in nameField to Paramita
        weightField.setText("74");// set text in weightField to 74
        heightField.setText("156");// set text in heightField to 156
        birthDateField.setText("18/02/2003");// set text in birthDateField to 18/02/2003
        maleButton.setSelected(true);// Set maleButton to selected
        watchingMoviesCheckBox.setSelected(true);// Set watchingMoviesCheckBox to selected
        yearExperienceSlider.setValue(10);// set Jslider value to 10
    }

    // Method for get values form text field and check box and gender button
    protected void getValues() {
        nameMes = "Name: " + nameField.getText() + "\n";// collect text in namefeild to nameMes
        weightMes = "Weight: " + weightField.getText() + " \n";// collect text in weightField to weightMes
        heightMes = "Height: " + heightField.getText() + " \n";// collect text in heightField to heightMes
        birthDateMes = "Date of birth: " + birthDateField.getText() + "\n";// collect text in birthDateField to
                                                                           // birthDateMes
        textFeildMes = nameMes + weightMes + heightMes + birthDateMes;// collect text in textfeild to textFeildMes
        stateHobbiesBT = "";
        for (JCheckBox checkBox : checkBoxsList) {// loop for get checkbox name if it is selected.
            if (checkBox.isSelected()) {// if checkBox is selected get checkBox name in stateHobbiesBT
                stateHobbiesBT += checkBox.getText() + ", ";
            } else {
                stateHobbiesBT += "";
            }
        }
        stateGenderBT = "";
        genderMes = maleButton.isSelected() ? "Gender: Male \n" : "Gender: Female \n";// if malebutton is selected get
                                                                                      // "Gender: Male \n" to genderMes
                                                                                      // if malebutton is deselected get "Gender: Female \n" to genderMes
        hobbieMes = "Hobbies: " + stateHobbiesBT;
        resultTxt = textFeildMes + genderMes + hobbieMes;// get textFeildMes ,genderMes ,hobbieMes in resultTxt
    }

    // Method that setting componant for cancel button 
    protected void setCancel() {
        setTFBGColor(textFiledColor);// set text field background color to kku color
        bioTextArea.setText("");// Clear text in bioTextArea
        buttonGenderGroup.clearSelection();// Clear status of gender button
        yearExperienceSlider.setValue(0);// Set value of slider to 0
    }

    // Method that setting componant for reset button 
    protected void setReset() {
        setTFBGColor(Color.WHITE);// set text field background color to white
        bioTextArea.setText("");// Clear text in bioTextArea
        buttonGenderGroup.clearSelection();// Clear status of gender button
        yearExperienceSlider.setValue(0);
        for (JTextField textField : textFieldList) {// loop for clear text in text field
            textField.setText(" ");
        }
        for (JCheckBox checkBox : checkBoxsList) {// loop for set selected of checkBox to false
            checkBox.setSelected(false);
        }
    }

    // Method for handle submit button
    protected void handleSubmitButton() {
        getValues();
        bioTextArea.setText(resultTxt);
    }

    // Method for handle cancel button
    protected void handleCancelButton() {
        setCancel();
    }

    // Method for handle reset button
    protected void handleResetButton() {
        setReset();
    }

    // Method for Handle action events
    public void actionPerformed(ActionEvent event) {
        Object sourceObject = event.getSource();
        if (sourceObject == submitButton) {// To event.getSource() is submitButton
            handleSubmitButton();// call method handleSubmitButton()
        } else if (sourceObject == cancelButton) {// To event.getSource() is cancelButton
            handleCancelButton();// call method handleCancelButton()
        } else if (sourceObject == resetButton) {// To event.getSource() is resetButton
            handleResetButton();// call method handleResetButton()
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
