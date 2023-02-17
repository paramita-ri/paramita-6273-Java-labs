/*
 * AthleteFormV5 program is program that extends from AthleteFormV4
 * The title of the program is set to “Athlete Form V5”
 * That has method setFrameFeatures() like AthleteFormV4
 * but have new variables by adding those variables by override method addComponents() and addMenus()
 * There are new Color: textFiledColor, fontSportColor, bioTextAreaColor, menuItemfontColor
 * to change color of text filed, sport label font, text area , and menu item font.
 * There are new Font: allLabelFont, buttonFont, menusAndMenuItemFont 
 * to change font of all text label , button ,and menu
 * and use setToolTipText to show messages:
 * "Press the cancel button to cancel this form" when press mouse on cancel button.
 * "Press the reset button to reset this form" when press mouse on reset button.
 * "Press the submit button to submit this form" when press mouse on submit button.
 * "To create new, open, save form or exit" when press mouse on file menu.
 * "To configure size and color of a component" when press mouse on config menu.
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 Febuary 2023
 */
package ritidet.paramita.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV5 extends AthleteFormV4 {
    protected Color textFiledColor, fontSportColor, bioTextAreaColor, menuItemfontColor;
    protected Font allLabelFont, buttonFont, menusAndMenuItemFont;

    public AthleteFormV5(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV5 msw = new AthleteFormV5("Athlete Form V5");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();
        textFiledColor = new Color(167, 59, 36);
        nameField.setBackground(textFiledColor);
        weightField.setBackground(textFiledColor);
        heightField.setBackground(textFiledColor);
        birthDateField.setBackground(textFiledColor);
        allLabelFont = new Font("Serif", Font.BOLD, 14);
        nameLabel.setFont(allLabelFont);
        weightLabel.setFont(allLabelFont);
        heightLabel.setFont(allLabelFont);
        birthDateLabel.setFont(allLabelFont);
        genderLabel.setFont(allLabelFont);
        hobbiesLabel.setFont(allLabelFont);
        nationalityLabel.setFont(allLabelFont);
        sportLabel.setFont(allLabelFont);
        bioLabel.setFont(allLabelFont);
        yearExperienceLabel.setFont(allLabelFont);
        fontSportColor = new Color(35, 45, 222);
        sport_Jlist.setForeground(fontSportColor);
        buttonFont = new Font("Serif", Font.BOLD + Font.ITALIC, 16);
        cancelButton.setFont(buttonFont);
        resetButton.setFont(buttonFont);
        submitButton.setFont(buttonFont);
        bioTextAreaColor = new Color(200, 200, 200);
        bioTextArea.setBackground(bioTextAreaColor);
        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submitButton.setToolTipText("Press the submit button to submit this form");
    }

    protected void addMenus() {
        super.addMenus();
        menusAndMenuItemFont = new Font("Sanserif", Font.BOLD, 14);
        fileMenu.setFont(menusAndMenuItemFont);
        newMenuItem.setFont(menusAndMenuItemFont);
        openItem.setFont(menusAndMenuItemFont);
        saveItem.setFont(menusAndMenuItemFont);
        exitItem.setFont(menusAndMenuItemFont);
        configMenu.setFont(menusAndMenuItemFont);
        colorMenu.setFont(menusAndMenuItemFont);
        redItem.setFont(menusAndMenuItemFont);
        blueItem.setFont(menusAndMenuItemFont);
        greenItem.setFont(menusAndMenuItemFont);
        sizeMenu.setFont(menusAndMenuItemFont);
        size16Item.setFont(menusAndMenuItemFont);
        size20Item.setFont(menusAndMenuItemFont);
        size24Item.setFont(menusAndMenuItemFont);
        menuItemfontColor = new Color(6, 57, 112);
        newMenuItem.setForeground(menuItemfontColor);
        openItem.setForeground(menuItemfontColor);
        saveItem.setForeground(menuItemfontColor);
        exitItem.setForeground(menuItemfontColor);
        colorMenu.setForeground(menuItemfontColor);
        redItem.setForeground(menuItemfontColor);
        blueItem.setForeground(menuItemfontColor);
        greenItem.setForeground(menuItemfontColor);
        sizeMenu.setForeground(menuItemfontColor);
        size16Item.setForeground(menuItemfontColor);
        size20Item.setForeground(menuItemfontColor);
        fileMenu.setToolTipText("To create new, open, save form or exit");
        configMenu.setToolTipText("To configure size and color of a component");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}