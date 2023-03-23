/*
 * AthleteFormV13 program is program that extends from AthleteFormV12
 * The title of the program is set to “Athlete Form V13”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 20 March 2023
 */
package ritidet.paramita.lab11;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import ritidet.paramita.lab5.Athlete.Gender;
import ritidet.paramita.lab6.AthleteV2;

public class AthleteFormV16 extends AthleteFormV15 {
    protected AthleteV2 inputAhlete;

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

    public void saveAthleteFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String fileName = selectedFile.getAbsolutePath();
            if (!fileName.endsWith(".txt")) {
                fileName += ".txt";
            }
            try {
                getAthlete();
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(inputAhlete);
                oos.close();
                fos.close();
                JOptionPane.showMessageDialog(this, "Saving the Athlete in the file " + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void openAthleteFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(selectedFile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                String odject = ois.readObject().toString();
                bioTextArea.append("\n" + odject);
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object selectObject = event.getSource();
        if (selectObject == saveItem) {// To Check if event.getSource() is JMenuItem -> saveItem
            saveAthleteFile();// call methods saveHobbiesFile()
        } else if (selectObject == openItem) {// To Check if event.getSource() is JMenuItem -> openItem
            openAthleteFile();// call methods openHobbiesFile()
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
