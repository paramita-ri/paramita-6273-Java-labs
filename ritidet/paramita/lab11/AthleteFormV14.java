/*
 * AthleteFormV14 program is program that extends from ritidet.paramita.lab10.AthleteFormV13
 * The title of the program is set to “Athlete Form V14”
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
import java.util.ArrayList;

public class AthleteFormV14 extends ritidet.paramita.lab10.AthleteFormV13 {
    protected String inputName = "", inputHobbies = "";// String varible for get name and hobbies from field
    protected ArrayList<String> hobbiesList = new ArrayList<String>();// ArrayList for get hobbies from checkBox

    public AthleteFormV14(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV14 msw = new AthleteFormV14("Athlete Form V14");// Show title "Athlete Form V14"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }

    // Method for save hobbies file when click save menu
    public void saveHobbiesFile() {
        JFileChooser fileChooser = new JFileChooser();// Create JFileChooser
        int returnValue = fileChooser.showSaveDialog(this);//Create int variable for get data from fileChooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {// Check if returnValue is equal to JFileChooser.APPROVE_OPTION
            File userSelectedFile = fileChooser.getSelectedFile();// Get selected file
            String fileName = userSelectedFile.getAbsolutePath();// Get file name
            if (!fileName.endsWith(".txt")) {// If file name not end with .txt
                fileName += ".txt";// add .txt to file name
            }
            try (FileWriter writer = new FileWriter(fileName)) {// Create FileWriter
                inputName = nameField.getText();// Get name from nameField
                getHobbies();// Call method getHobbies()
                if (hobbiesList.size() == 1) {// If hobbiesList size is 1
                    writer.write(inputName + "\n" + hobbiesList.toString().replace("[", " ").replace("]", ""));// Write
                                                                                                               // name
                                                                                                               // and
                                                                                                               // hobbies
                                                                                                               // to
                                                                                                               // file
                    writer.close();// Close FileWriter
                    JOptionPane.showMessageDialog(this, "Saving a hobby in file " + fileName);// Show message dialog
                                                                                              // that file is saved
                } else {
                    writer.write(inputName + "\n" + hobbiesList.toString().replace("[", " ").replace("]", ""));// Write
                                                                                                               // name
                                                                                                               // and
                                                                                                               // hobbies
                                                                                                               // to
                                                                                                               // file
                    writer.close();// Close FileWriter
                    JOptionPane.showMessageDialog(this, "Saving hobbies in file " + fileName);// Show message dialog
                                                                                              // that file is saved
                }
            } catch (IOException e) {
                e.printStackTrace();// Print error message
            }
        }
    }

    public void getHobbies() {// Method for get hobbies from checkBox
        for (JCheckBox hobbies : checkBoxsList) {// Loop for get checkBox from checkBoxsList
            if (hobbies.isSelected()) {// if checkBox is selected get checkBox name in inputHobbies
                hobbiesList.add(hobbies.getText());// Add checkBox name to hobbiesList
            }
        }
    }

    // Method for open hobbies file when click open menu
    public void openHobbiesFile() {
        JFileChooser fileChooser = new JFileChooser();// Create JFileChooser
        int returnValue = fileChooser.showOpenDialog(this);//Create int variable for get data from fileChooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {// Check if returnValue is equal to JFileChooser.APPROVE_OPTION
            File userSelectedFile = fileChooser.getSelectedFile();// Get selected file
            try {
                BufferedReader reader = new BufferedReader(new FileReader(userSelectedFile));// Create BufferedReader
                String line;// String varible for read line
                ArrayList<String> wordListFormFile = new ArrayList<String>();// ArrayList for get hobbies from file
                while ((line = reader.readLine()) != null) {// Loop for read file line by line
                    String[] wordsInFile = line.split(" ");// Split line by space
                    for (String word : wordsInFile) {// Loop for get word from wordsInFile
                        wordListFormFile.add(word);// Add word to wordListFormFile
                    }
                }
                String nameFromFile = wordListFormFile.get(0);// Get name from wordListFormFile in index 0
                String hobbiesFromFile = "";// String varible for get hobbies from file
                String displayHobbyText = "";// String varible for get text that will show in text area
                if (wordListFormFile.size() > 3) {// If wordListFormFile size is more than 3
                    for (int i = 2; i < wordListFormFile.size(); i++) {// Loop for get hobbies from wordListFormFile
                        hobbiesFromFile += wordListFormFile.get(i) + " ";// Add hobbies to hobbiesFromFile
                    }
                    displayHobbyText = nameFromFile + " has hobbies as " + hobbiesFromFile;// Set text that will show in
                                                                                           // text area
                    bioTextArea.setText(displayHobbyText);// Set text to text area
                } else if (wordListFormFile.size() == 3) {// If wordListFormFile size is 3
                    hobbiesFromFile += wordListFormFile.get(2);// Add hobbies to hobbiesFromFile
                    displayHobbyText = nameFromFile + " has a hobby as " + hobbiesFromFile;// Set text that will show in
                                                                                           // text area
                    bioTextArea.setText(displayHobbyText);// Set text to text area
                } else {
                    bioTextArea.setText(nameFromFile + " does not have any hobby");// Set text to text area
                }
                reader.close();// Close BufferedReader
            } catch (Exception e) {
                e.printStackTrace();// Print error message
            }
        }
    }

    // Overide method actionPerformed(ActionEvent event)
    public void actionPerformed(ActionEvent event) {
        Object selectObject = event.getSource();// Get event source to selectObject
        if (selectObject == saveItem) {// To Check if event.getSource() is JMenuItem -> saveItem
            saveHobbiesFile();// call methods saveHobbiesFile()
        } else if (selectObject == openItem) {// To Check if event.getSource() is JMenuItem -> openItem
            openHobbiesFile();// call methods openHobbiesFile()
        } else {
            super.actionPerformed(event);// Call methods actionPerformed(event) from AthleteFormV13;
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