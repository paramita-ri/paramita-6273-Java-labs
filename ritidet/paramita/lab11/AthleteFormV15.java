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

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

public class AthleteFormV15 extends AthleteFormV14 {
    public AthleteFormV15(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV15 msw = new AthleteFormV15("Athlete Form V15");// Show title "Athlete Form V13"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }

    public void saveYearFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String fileName = selectedFile.getAbsolutePath();
            if (!fileName.endsWith(".txt")) {
                fileName += ".txt";
            }
            try (FileWriter writer = new FileWriter(fileName)) {
                inputName = nameField.getText();
                int value = yearExperienceSlider.getValue();
                writer.write(inputName + " " + value);
                writer.close();
                JOptionPane.showMessageDialog(this, "Saving experiences year in file " + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void openYearFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                String line;
                ArrayList<String> data = new ArrayList<String>();
                // Read the file line by line
                while ((line = reader.readLine()) != null) {
                    // Split the line into words using a space delimiter
                    String[] words = line.split(" ");
                    // Iterate through the array of words and process each word
                    for (String word : words) {
                        data.add(word);
                    }
                }
                String nameFromFile = data.get(0);
                String yearFromFile = data.get(1);
                int yearInNum = Integer.parseInt(yearFromFile);
                String showMes = "";
                // Check if data size is more than 3
                if (yearInNum > 1) {
                    showMes = nameFromFile + " has " + yearFromFile + " years of experiences";
                    bioTextArea.append("\n" + showMes);
                } else if (yearInNum <= 1) {
                    showMes = nameFromFile + " has " + yearFromFile + " year of experiences";
                    bioTextArea.append("\n" + showMes);
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object selectObject = event.getSource();
        if (selectObject == saveItem) {// To Check if event.getSource() is JMenuItem -> saveItem
            saveYearFile();// call methods saveHobbiesFile()
        } else if (selectObject == openItem) {// To Check if event.getSource() is JMenuItem -> openItem
            openYearFile();// call methods openHobbiesFile()
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}