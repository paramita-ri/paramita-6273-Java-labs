/*
 * AthleteFormV16 program is program that extends from AthleteFormV15
 * The title of the program is set to “Athlete Form V16”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 20 March 2023
 */
package ritidet.paramita.lab11;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import ritidet.paramita.lab6.AthleteV2;
import ritidet.paramita.lab5.Athlete.Gender;

public class AthleteFormV16 extends AthleteFormV15 {
    protected AthleteV2 inputAhlete;// Create new object inputAhlete from AthleteV2

    public AthleteFormV16(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV16 msw = new AthleteFormV16("Athlete Form V16");// Show title "Athlete Form V13"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }

    // Method for get athlete
    public void getAthlete() {
        String inputName = nameField.getText();// Create String variable for get data from nameField
        double inputWeight = Double.parseDouble(weightField.getText());// Create double variable for get data from
                                                                       // weightField
        double inputHeight = Double.parseDouble(heightField.getText());// Create double variable for get data from
                                                                       // heightField
        Gender inputGender = femaleButton.isSelected() ? Gender.FEMALE : Gender.MALE;// Create Gender variable for from
                                                                                     // data from GenderButton
        String inputNationality = (String) nationality_box.getSelectedItem();// Create String variable for get data from
                                                                             // nationality_box
        String inputBirthDate = birthDateField.getText();// Create String variable for get data from birthDateField
        inputAhlete = new AthleteV2(inputName, inputWeight, inputHeight, inputGender, inputNationality,
                inputBirthDate);// Create new object inputAhlete by use data from user
    }

    // Method for save athlete in file
    public void saveAthleteFile() {
        JFileChooser fileChooser = new JFileChooser();// Create new object fileChooser
        int returnValue = fileChooser.showSaveDialog(this);// Create int variable for get data from fileChooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {// Check if returnValue is equal to JFileChooser.APPROVE_OPTION
            File userSelectedFile = fileChooser.getSelectedFile();// Create new object userSelectedFile
            String fileName = userSelectedFile.getAbsolutePath();// Create String variable for get data from
                                                                 // userSelectedFile
            if (!fileName.endsWith(".txt")) {// Check if fileName is not end with ".txt"
                fileName += ".txt";// Add ".txt" to fileName
            }
            try {
                getAthlete();// Call method getAthlete()
                FileOutputStream fos = new FileOutputStream(fileName);// Create new object fos
                ObjectOutputStream oos = new ObjectOutputStream(fos);// Create new object oos
                oos.writeObject(inputAhlete);// Write object inputAhlete to file
                oos.close();// Close oos
                fos.close();// Close fos
                JOptionPane.showMessageDialog(this, "Saving the Athlete in the file " + fileName);// Show message dialog
                                                                                                  // "Saving the Athlete
                                                                                                  // in
                                                                                                  // the file " +
                                                                                                  // fileName
            } catch (Exception e) {
                e.printStackTrace();// Print error
            }
        }
    }

    // Method for open athlete in file
    public void openAthleteFile() {
        JFileChooser fileChooser = new JFileChooser();// Create new object fileChooser
        int returnValue = fileChooser.showOpenDialog(this);// Create int variable for get data from fileChooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {// Check if returnValue is equal to JFileChooser.APPROVE_OPTION
            File userSelectedFile = fileChooser.getSelectedFile();// Create new object userSelectedFile
            try {
                FileInputStream fis = new FileInputStream(userSelectedFile);// Create new object fis
                ObjectInputStream ois = new ObjectInputStream(fis);// Create new object ois
                String odject = ois.readObject().toString();// Create String variable for get data from ois
                bioTextArea.append("\n" + odject);// Append odject to bioTextArea
                ois.close();// Close ois
            } catch (Exception e) {
                e.printStackTrace();// Print error
            }
        }
    }

    // Overide method actionPerformed(ActionEvent event)
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);// Call method actionPerformed(ActionEvent event) from AthleteFormV15
        Object selectObject = event.getSource();
        if (selectObject == saveItem) {// To Check if event.getSource() is JMenuItem -> saveItem
            saveAthleteFile();// call methods saveAthleteFile()
        } else if (selectObject == openItem) {// To Check if event.getSource() is JMenuItem -> openItem
            openAthleteFile();// call methods openAthleteFile()
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