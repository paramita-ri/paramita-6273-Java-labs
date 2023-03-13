/*
 * AthleteFormV12 program is program that extends from AthleteFormV11
 * The title of the program is set to “Athlete Form V12”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 March 2023
 */
package ritidet.paramita.lab10;

import javax.swing.*;
import java.awt.event.*;
import java.util.Collections;

public class AthleteFormV12 extends AthleteFormV11 {
    public AthleteFormV12(String title) {
        super(title);
    }

    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV12 msw = new AthleteFormV12("Athlete Form V12");// Show title "Athlete Form V12"
        msw.addComponents();// Call method addComponents()
        msw.initValues();// Call method initValues()
        msw.addMenus();// Call method addMenus()
        msw.addListeners();// Call method addListeners()
        msw.setFrameFeatures();// Call method setFrameFeatures()
    }

    // Method for add Listener
    public void addListeners() {
        super.addListeners();// Call methods addListeners() from AthleteFormV10
        byNameMI.addActionListener(this);// Add ActionListener to byNameMI
        byHeightMI.addActionListener(this);// Add ActionListener to byHeightMI
        byHWMI.addActionListener(this);// Add ActionListener to byHWMI
    }

    // Method for sorting ArrayList of Ahtlete by name
    public void sortByName() {
        Collections.sort(athleteArr, new NameComparator());// Sorting athlete in ArrayList by NameComparator()
        super.displayAthletes();// display ArrayList of Ahtlete after sort
    }

    // Method for sorting ArrayList of Ahtlete by height
    public void sortByHeight() {
        Collections.sort(athleteArr, new HeightComparator());// Sorting athlete in ArrayList by HeightComparator()
        super.displayAthletes();// display ArrayList of Ahtlete after sort
    }

    // Method for sorting ArrayList of Ahtlete by height and weight
    public void sortByHeightAndWeight() {
        Collections.sort(athleteArr, new HeightWeightComparator());// Sorting athlete in ArrayList by
                                                                   // HeightWeightComparator()
        super.displayAthletes();// display ArrayList of Ahtlete after sort
    }

    // Overide method actionPerformed(ActionEvent event)
    public void actionPerformed(ActionEvent event) {
        Object selectObject = event.getSource();
        if (selectObject == byNameMI) {// To Check is event.getSource() is JMenuItem -> byNameMI
            sortByName();// call methods sortByName();
        } else if (selectObject == byHeightMI) {// To Check is event.getSource() is JMenuItem -> byHeightMI
            sortByHeight();// call methods sortByName();
        } else if (selectObject == byHWMI) {// To Check is event.getSource() is JMenuItem -> byHWMI
            sortByHeightAndWeight();// call methods sortByName();
        } else {
            super.actionPerformed(event);// call methods actionPerformed(event) from AthleteFormV11;
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