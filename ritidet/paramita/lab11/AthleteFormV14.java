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

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class AthleteFormV14 extends ritidet.paramita.lab10.AthleteFormV13 {
    protected String inputName = "", inputHobbies = "";
    protected ArrayList<String> hobbiesList = new ArrayList<String>();

    public AthleteFormV14(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV14 msw = new AthleteFormV14("Athlete Form V14");// Show title "Athlete Form V13"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }

    // Method for save hobbies file when click save menu
    public void saveHobbiesFile() {
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
                getHobbies();
                if (hobbiesList.size() == 1) {
                    writer.write(inputName + "\n" + hobbiesList.toString().replace("[", " ").replace("]", ""));
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Saving a hobby in file " + fileName);
                } else {
                    writer.write(inputName + "\n" + hobbiesList.toString().replace("[", " ").replace("]", ""));
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Saving hobbies in file " + fileName);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getHobbies() {
        for (JCheckBox hobbies : checkBoxsList) {
            if (hobbies.isSelected()) {// if checkBox is selected get checkBox name in inputHobbies
                hobbiesList.add(hobbies.getText());
            }
        }
    }

    // Method for open hobbies file when click open menu
    public void openHobbiesFile() {
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
                String hobbiesFromFile = "";
                String showMes = "";
                // Check if data size is more than 3
                if (data.size() > 3) {
                    // Add hobbies to hobbiesFromFile
                    for (int i = 2; i < data.size(); i++) {
                        hobbiesFromFile += data.get(i) + " ";
                    }
                    showMes = nameFromFile + " has hobbies as " + hobbiesFromFile;
                    bioTextArea.setText(showMes);
                } else if (data.size() == 3) {
                    hobbiesFromFile += data.get(2);
                    showMes = nameFromFile + " has a hobby as " + hobbiesFromFile;
                    bioTextArea.setText(showMes);
                } else {
                    bioTextArea.setText(nameFromFile + " does not have any hobby");
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Overide method actionPerformed(ActionEvent event)
    public void actionPerformed(ActionEvent event) {
        Object selectObject = event.getSource();
        if (selectObject == saveItem) {// To Check if event.getSource() is JMenuItem -> saveItem
            saveHobbiesFile();// call methods saveHobbiesFile()
        } else if (selectObject == openItem) {// To Check if event.getSource() is JMenuItem -> openItem
            openHobbiesFile();// call methods openHobbiesFile()
        } else {
            super.actionPerformed(event);// Call methods actionPerformed(event) from AthleteFormV10;
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