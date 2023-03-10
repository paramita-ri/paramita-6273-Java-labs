/*
 * AthleteFormV9 program is program that extends from AthleteFormV8
 * The title of the program is set to “Athlete Form V9”
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 27 Febuary 2023
 */
package ritidet.paramita.lab9;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {
    protected Object actionListnerObject, itemListenerObject;
    protected String textFieldName, textFieldvalues, selectMenu;
    protected ArrayList<JMenuItem> menuItemList = new ArrayList<JMenuItem>();// ArrayList for JMenuItem.
    protected ArrayList<JRadioButton> genderbuttonlist = new ArrayList<JRadioButton>();// ArrayList for JRadioButton.

    public AthleteFormV9(String title) {
        super(title);
    }
    // Method for create and show GUI
    public static void createAndShowGUI() {
        AthleteFormV9 msw = new AthleteFormV9("Athlete Form V9");
        msw.addComponents();// Add Components
        msw.initValues();// Set the initial value of the variable.
        msw.addMenus();// Add menus
        msw.addListeners();// Add Listeners
        msw.setFrameFeatures();// Set Frame
    }
    // Method for Add Components
    protected void addComponents() {
        super.addComponents();//Call method addComponents() from AthleteFormV8
        nameField.setName("Name");//set name of nameField to Name
        weightField.setName("Weight");//set name of weightField to Weight
        heightField.setName("Height");//set name of heightField to Height
        birthDateField.setName("Date of Birth");//set name of birthDateField to Date of Birth
        nationality_box.setName("Nationality");//set name of nationality_box to Nationality
        genderbuttonlist.add(maleButton);//add maleButton to genderbuttonlist
        genderbuttonlist.add(femaleButton);//add maleButton to femaleButton

    }
    //Method for add and setting menu
    public void addMenus() {
        super.addMenus();//Call method addMenus() from AthleteFormV8
        menuItemList.add(newMenuItem);//add newMenuItem to menuItemList
        menuItemList.add(openItem);//add openItem to menuItemList
        menuItemList.add(saveItem);//add saveItem to menuItemList
        menuItemList.add(exitItem);//add exitItem to menuItemList
        newMenuItem.setName("New");//set name of newMenuItem to New
        openItem.setName("Open");//set name of openItem to Open
        saveItem.setName("Save");//set name of saveItem to Save
        exitItem.setName("Exit");//set name of newMenuItem to Exit
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.META_DOWN_MASK));//set sort cut key for newMenuItem to command + N
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.META_DOWN_MASK));//set sort cut key for openItem to command + O
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.META_DOWN_MASK));//set sort cut key for saveItem to command + S
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.META_DOWN_MASK));//set sort cut key for exitItem to command + Q
        newMenuItem.setMnemonic(KeyEvent.VK_N);//set Mnemonic key for newMenuItem to N
        openItem.setMnemonic(KeyEvent.VK_O);//set Mnemonic key for openItem to O
        saveItem.setMnemonic(KeyEvent.VK_S);//set Mnemonic key for saveItem to S
        exitItem.setMnemonic(KeyEvent.VK_X);//set Mnemonic key for exitItem to X
    }
    // Method for add Listener
    protected void addListeners() {
        super.addListeners();
        for (JTextField infoTextField : textFieldList) {//loop for addActionListener to infoTextField
            infoTextField.addActionListener(this);
        }
        nationality_box.addActionListener(this);//add ActionListener to nationality_box
        for (JMenuItem menuItem : menuItemList) {//loop for addActionListener to menuItem
            menuItem.addActionListener(this);
        }
        maleButton.addItemListener(this);//add ItemListener to maleButton
        femaleButton.addItemListener(this);//add ItemListener to femaleButton

        for (JCheckBox nationCheckBox : checkBoxsList) {//loop for addItemListener to checkBox
            nationCheckBox.addItemListener(this);
        }

    }
    // Method for Handle action events
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);//call method actionPerformed(ActionEvent event) from AthleteFormV8
        actionListnerObject = event.getSource();//set actionListnerObject by get event.getSource()
        for (JTextField infoTextField : textFieldList) {//loop for handle action events with TextField
            if (actionListnerObject == infoTextField) {//to check if user is change data in textfield
                JOptionPane.showMessageDialog(this, infoTextField.getName() + " is changed to " + infoTextField.getText());//showMessageDialog <new text in TextField>
            }
        }
        if (actionListnerObject == nationality_box) {//to check if user is select data in textfield
            JComboBox<?> comboBoxSelected = (JComboBox<?>) actionListnerObject;
            if (comboBoxSelected.getSelectedItem() instanceof String) {//to check if comboBox is Selected
                JOptionPane.showMessageDialog(this, //showMessageDialog <name of Selected combobox>
                        comboBoxSelected.getName() + " is changed to " + (String) comboBoxSelected.getSelectedItem());
            }
        }
        for (JMenuItem menuItem : menuItemList) {//loop for handle action events with menuItem
            if (menuItem == actionListnerObject) {//to check if user is click menuItem
                if (menuItem == newMenuItem || menuItem == openItem || menuItem == saveItem) {//to check if menuItem is newMenuItem or openItem or saveItem
                    JOptionPane.showMessageDialog(this, "You click menu " + menuItem.getName());//showMessageDialog <menuItem is clicked>
                } else {//to check if exitItem
                    System.exit(0);//exit 
                }
            }
        }
    }
    // Method for Handle Item events
    public void itemStateChanged(ItemEvent event) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                itemListenerObject = event.getSource();//set itemListenerObject by get event.getSource()
                for (JRadioButton genderbutton : genderbuttonlist) {//loop for handle item events with genderbutton
                    if (itemListenerObject == genderbutton) {//check that event.getSource() is genderbutton
                        JRadioButton genderSelected = (JRadioButton) event.getItemSelectable();//set genderSelected by get event.getItemSelectable()
                        if (event.getStateChange() == ItemEvent.SELECTED) {//check that if genderbutton is selected
                            JOptionPane.showMessageDialog(null, genderSelected.getText() + " is Selected");//showMessageDialog <gender> is selected
                        }
                    }
                }

                for (JCheckBox nationCheckBox : checkBoxsList) {
                    if (itemListenerObject == nationCheckBox) {//loop for handle item events with genderbutton
                        JCheckBox checkboxSelected = (JCheckBox) event.getItemSelectable();//set checkboxSelected by get event.getItemSelectable()
                        if (event.getStateChange() == ItemEvent.SELECTED) {//check that if checkBox is selected
                            JOptionPane.showMessageDialog(null, checkboxSelected.getText() + " is also your hobby");//showMessageDialog <name checkbox> is is also your hobby
                        } else if (event.getStateChange() == ItemEvent.DESELECTED) {//check that if checkBox is deselected
                            JOptionPane.showMessageDialog(null,
                                    checkboxSelected.getText() + " is no longer your hobby");//showMessageDialog <name checkbox> is is no longer your hobby
                        }
                    }
                }
            }
        });
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