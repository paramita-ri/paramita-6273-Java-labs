/*
 * AthleteFormV10 program is program that extends from AthleteFormV9
 * The title of the program is set to “Athlete Form V10”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 27 Febuary 2023
 */
package ritidet.paramita.lab9;

import javax.swing.*;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.event.*;

public class AthleteFormV10 extends AthleteFormV9 implements ListSelectionListener, ChangeListener {
    public AthleteFormV10(String title) {
        super(title);
    }
    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV10 msw = new AthleteFormV10("Athlete Form V10");
        msw.addComponents();// Add Components
        msw.initValues();// Set the initial value of the variable.
        msw.addMenus();// Add menus
        msw.addListeners();// Add Listeners
        msw.setFrameFeatures();// Set Frame
    }
    // Method for add Listener
    public void addListeners() {
        super.addListeners();//method addListeners() from AthleteFormV9
        sport_Jlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//set ListSelectionModel of sport_Jlist to MULTIPLE_INTERVAL_SELECTION
        sport_Jlist.addListSelectionListener(this);//add ListSelectionListener to sport_Jlist
        yearExperienceSlider.addChangeListener(this);//add addChangeListener to yearExperienceSlider
    }
    // Method for Handle Change events
    public void stateChanged(ChangeEvent event) {
        JSlider sliderSelectedValue = (JSlider) event.getSource();
        if (!sliderSelectedValue.getValueIsAdjusting()) {//to check that the user has completed their selection.
            int value = yearExperienceSlider.getValue();//get value from jslider to value
            JOptionPane.showMessageDialog(this, "# of experience years is " + value);//showMessageDialog value of slider
        }

    }
    // Method for Handle ListsSelection events
    public void valueChanged(ListSelectionEvent event) {
        String messageSport = "";
        if (!event.getValueIsAdjusting()) {//to check that the user has completed their selection.
            List<String> selectedSport = sport_Jlist.getSelectedValuesList();//creat List<String> selectedSport from sport_Jlist.getSelectedValuesList()
            int selectedNum = selectedSport.size();//get size of selectedSport to selectedNum
            if (selectedNum > 1) {//to check if selected in Jlist is more than one 
                for (int i = 0; i < selectedNum; i++) {//loop for get <seleted sport in jlist> to messageSport
                    messageSport += selectedSport.get(i) + " ";
                }
                JOptionPane.showMessageDialog(this, "Selected sports are " + messageSport);//showMessageDialog Selected sports are <seleted sport in jlist>
            } else if (selectedNum == 1) {//to check if selected in Jlist is one 
                for (int i = 0; i < selectedNum; i++) {//loop for get <seleted sport in jlist> to messageSport
                    messageSport += selectedSport.get(i) + " ";
                }
                JOptionPane.showMessageDialog(this, "Selected sports is " + messageSport);//showMessageDialog Selected sports is <seleted sport in jlist>
            }
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