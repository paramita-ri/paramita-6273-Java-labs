/*
 * AthleteFormV11 program is program that extends from ritidet.paramita.lab9.AthleteFormV10
 * The title of the program is set to “Athlete Form V11”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 March 2023
 */
package ritidet.paramita.lab10;

import ritidet.paramita.lab6.AthleteV2;
import ritidet.paramita.lab5.Athlete.Gender;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AthleteFormV11 extends ritidet.paramita.lab9.AthleteFormV10 {
    protected Font menuFont = new Font("Serif", Font.BOLD, 14);// Create variable for get Font of Menu
    protected JMenu dataMenu, sortMenu;// Create new JMenu variable dataMenu, sortMenu
    protected JMenuItem addMI, displayMI, clearMI, searchMI, byNameMI, byHeightMI, byHWMI;// Create new JMenuItem
                                                                                          // variable addMI, displayMI,
                                                                                          // clearMI, searchMI,
                                                                                          // byNameMI, byHeightMI,
                                                                                          // byHWMI;
    protected ArrayList<AthleteV2> athleteArr = new ArrayList<AthleteV2>();// Create ArrayList for collect new athlete

    public AthleteFormV11(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV11 msw = new AthleteFormV11("Athlete Form V11");// Show title "Athlete Form V11"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }

    public void addMenus() {
        super.addMenus();
        dataMenu = new JMenu("Data");// Create Menu Data
        sortMenu = new JMenu("Sort");// Create Menu Sort
        addMI = new JMenuItem("Add");// Create Menu Item Add
        displayMI = new JMenuItem("Display");// Create Menu Item Display
        clearMI = new JMenuItem("Clear");// Create Menu Item Clear
        searchMI = new JMenuItem("Search");// Create Menu Item Search
        byNameMI = new JMenuItem("By Name");// Create Menu Item By Name
        byHeightMI = new JMenuItem("By Height");// Create Menu Item By Height
        byHWMI = new JMenuItem("By Height and Weight");// Create Menu Item By Height and Weight
        dataMenu.add(addMI);// add addMI to dataMenu
        dataMenu.add(displayMI);// displayMI addMI to dataMenu
        dataMenu.add(clearMI);// add clearMI to dataMenu
        dataMenu.add(searchMI);// add searchMI to dataMenu
        dataMenu.add(sortMenu);// add sortMenu to dataMenu
        sortMenu.add(byNameMI);// add byNameMI to sortMenu
        sortMenu.add(byHeightMI);// add byHeightMI to sortMenu
        sortMenu.add(byHWMI);// add byHWMI to sortMenu
        menuBar.add(dataMenu);// add dataMenu to menuBar
        dataMenu.setFont(menuFont);// set font of menu
        sortMenu.setFont(menuFont);// set font of menu
        addMI.setFont(menuFont);// set font of menu
        displayMI.setFont(menuFont);// set font of menu
        clearMI.setFont(menuFont);// set font of menu
        searchMI.setFont(menuFont);// set font of menu
        byNameMI.setFont(menuFont);// set font of menu
        byHeightMI.setFont(menuFont);// set font of menu
        byHWMI.setFont(menuFont);// set font of menu
    }

    // Method for add Listener
    public void addListeners() {
        super.addListeners();// Call methods addListeners() from AthleteFormV10
        addMI.addActionListener(this);// Add ActionListener to addMI
        displayMI.addActionListener(this);// Add ActionListener to displayMI
        clearMI.addActionListener(this);// Add ActionListener to clearMI
        searchMI.addActionListener(this);// Add ActionListener to searchMI
    }

    // Methods for get new Athlete;
    public void getValues() {
        super.getValues();// Call Methods getValues from AthleteFormV10
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
        AthleteV2 inputAhlete = new AthleteV2(inputName, inputWeight, inputHeight, inputGender, inputNationality,
                inputBirthDate);// Create new object inputAhlete by use data from user
        athleteArr
                .add(new AthleteV2(inputName, inputWeight, inputHeight, inputGender, inputNationality, inputBirthDate));// Add
                                                                                                                        // new
                                                                                                                        // object
                                                                                                                        // AthleteV2
                                                                                                                        // by
                                                                                                                        // use
                                                                                                                        // data
                                                                                                                        // from
                                                                                                                        // user
                                                                                                                        // in
                                                                                                                        // athleteArr
        JOptionPane.showMessageDialog(this, inputAhlete.toString());// display data in inputAhlete
    }

    // Methods for add new Athlete
    public void addAthlete() {
        getValues();// Call Methods getValues
    }

    // Method for display data in athleteArr
    public void displayAthletes() {
        String displayAthletes = ""; // Create String variable displayAthletes for get each athlete from athleteArr
        int order = 1;// Create int variable for run order
        for (AthleteV2 athlete : athleteArr) {// loop for get each athlete in athleteArr
            displayAthletes += order + ". " + athlete.toString() + "\n";// get <order>. athlete.toString() "\n" in
                                                                        // displayAthletes
            order++;// order plus one
        }
        if (athleteArr.size() == 0) {// To check if in athleteArr doesn't has athlete
            JOptionPane.showMessageDialog(this, "There is no athlete in the list.");// showMessageDialog "There is no
                                                                                    // athlete in the list."
        } else if (athleteArr.size() == 1) {// To check if in athleteArr has one athlete
            JOptionPane.showMessageDialog(this, "There is one athletes as follows:\n" + displayAthletes);// showMessageDialog
                                                                                                         // "There is
                                                                                                         // one athletes
                                                                                                         // as
                                                                                                         // follows:\n"
                                                                                                         // +
                                                                                                         // <displayAthletes>
        } else {// if in athleteArr have many athlete
            JOptionPane.showMessageDialog(this,
                    "There are " + athleteArr.size() + " one athletes as follows:\n" + displayAthletes);// showMessageDialog
                                                                                                        // "There are "
                                                                                                        // +
                                                                                                        // athleteArr.size()
                                                                                                        // + " one
                                                                                                        // athletes as
                                                                                                        // follows:\n" +
                                                                                                        // <displayAthletes>
        }
    }

    // Method for search athlete data in athleteArr
    public void searchAthlete() {
        String enterAthlete = JOptionPane.showInputDialog(this, "Please enter athlete name:");// showInputDialog to get
                                                                                              // name for search from
                                                                                              // user get in
                                                                                              // enterAthlete
        for (AthleteV2 athlete : athleteArr) {// for check each athlete in athleteArr
            if (athlete.getName().equals(enterAthlete)) {// if name of athlete in athleteArr macth with name from user
                JOptionPane.showMessageDialog(this, athlete.toString() + " is found");// showMessageDialog
                                                                                      // athlete.toString() + " is
                                                                                      // found"
            } else {// if name of athlete in athleteArr not macth with name from user
                JOptionPane.showMessageDialog(this, "Athlete " + enterAthlete + " is NOT found");// showMessageDialog
                                                                                                 // "Athlete " +
                                                                                                 // enterAthlete + " is
                                                                                                 // NOT found"
            }
        }
    }

    // Overide method actionPerformed(ActionEvent event)
    public void actionPerformed(ActionEvent event) {
        Object selectObject = event.getSource();
        if (selectObject == addMI) {// To Check is event.getSource() is JMenuItem -> addMI
            addAthlete();// call methods addAthlete();
        } else if (selectObject == displayMI) {// To Check is event.getSource() is JMenuItem -> displayMI
            displayAthletes();// call methods displayAthletes();
        } else if (selectObject == clearMI) {// To Check is event.getSource() is JMenuItem -> clearMI
            athleteArr.clear();// clear everthing in ArrayList of Ahtlete
        } else if (selectObject == searchMI) {// To Check is event.getSource() is JMenuItem -> searchMI
            searchAthlete();// call methods searchAthlete();
        } else {
            super.actionPerformed(event);// call methods actionPerformed(event) from AthleteFormV10;
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