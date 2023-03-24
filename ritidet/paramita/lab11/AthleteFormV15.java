/*
 * AthleteFormV15 program is program that extends from AthleteFormV14
 * The title of the program is set to “Athlete Form V15”
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

public class AthleteFormV15 extends AthleteFormV14 {
    public AthleteFormV15(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV15 msw = new AthleteFormV15("Athlete Form V15");// Show title "Athlete Form V15"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }
    // Method for save year of experiences in file
    public void saveYearFile() {
        JFileChooser fileChooser = new JFileChooser();// Create JFileChooser
        int returnValue = fileChooser.showSaveDialog(this);// Create int variable for get data from fileChooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {// Check if returnValue is equal to JFileChooser.APPROVE_OPTION
            File userSelectedFile = fileChooser.getSelectedFile();// Get selected file
            String fileName = userSelectedFile.getAbsolutePath();// Get file name
            if (!fileName.endsWith(".txt")) {// If file name not end with .txt
                fileName += ".txt";// add .txt to file name
            }
            try {
                FileWriter writer = new FileWriter(fileName);// Create FileWriter
                inputName = nameField.getText();// Get name from nameField
                int value = yearExperienceSlider.getValue();// Get value from yearExperienceSlider
                writer.write(inputName + " " + value);// Write name and year of experiences to file
                writer.close();// Close file
                JOptionPane.showMessageDialog(this, "Saving experiences year in file " + fileName);// Show message dialog "Saving experiences year in file " + fileName    
            } catch (Exception e) {
                e.printStackTrace();// Print error        
            }
        }
    }
    // Method for open year of experiences file
    public void openYearFile() {
        JFileChooser fileChooser = new JFileChooser();// Create JFileChooser
        int returnValue = fileChooser.showOpenDialog(this);//Create int variable for get data from fileChooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {// Check if returnValue is equal to JFileChooser.APPROVE_OPTION
            File userSelectedFile = fileChooser.getSelectedFile();// Get selected file
            try {
                BufferedReader reader = new BufferedReader(new FileReader(userSelectedFile));// Create BufferedReader
                String line;// Create String variable line
                ArrayList<String> wordListFormFile = new ArrayList<String>();// Create ArrayList for store word from file
                while ((line = reader.readLine()) != null) {// Read line from file
                    String[] wordsInFile = line.split(" ");// Split line into wordsInFile
                    for (String word : wordsInFile) {// Loop for get word from wordsInFile
                        wordListFormFile.add(word);// Add word to wordListFormFile
                    }
                }
                String nameFromFile = wordListFormFile.get(0);// Get name from wordListFormFile index 0
                String yearFromFile = wordListFormFile.get(1);// Get year of experiences from wordListFormFile index 1
                int yearInNum = Integer.parseInt(yearFromFile);// Convert year of experiences from String to int
                String displayYearTxt = "";// Create String variable for display year of experiences
                // Check if wordListFormFile size is more than 3
                if (yearInNum > 1) {// Check if yearInNum is more than 1        
                    displayYearTxt = nameFromFile + " has " + yearFromFile + " years of experiences";// Set displayYearTxt
                    bioTextArea.append("\n" + displayYearTxt);// Append displayYearTxt to bioTextArea
                } else if (yearInNum <= 1) {// Check if yearInNum is less than or equal to 1
                    displayYearTxt = nameFromFile + " has " + yearFromFile + " year of experiences";// Set displayYearTxt
                    bioTextArea.append("\n" + displayYearTxt);// Append displayYearTxt to bioTextArea
                }
                reader.close();// Close file
            } catch (Exception e) {
                e.printStackTrace();// Print error
            }
        }
    }
    // Overide method actionPerformed(ActionEvent event)
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);// Call method actionPerformed(ActionEvent event) from AthleteFormV14
        Object selectObject = event.getSource();
        if (selectObject == saveItem) {// To Check if event.getSource() is JMenuItem -> saveItem
            saveYearFile();// call methods saveYearFile()
        } else if (selectObject == openItem) {// To Check if event.getSource() is JMenuItem -> openItem
            openYearFile();// call methods openYearFile()
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