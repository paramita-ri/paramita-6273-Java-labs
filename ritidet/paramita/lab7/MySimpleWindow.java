/*
 * MySimpleWindow program is program that extends from class JFrame 
 * The title of the program is set to "My Simple Window"
 * There are three variables for three buttons whose names are “Cancel”, “Reset” and “Submit”. 
 * These buttons should be protected.
 * There are two panels, the main panel and the panel for the button. Similarly, 
 * these panels should be protected.
 * Implement method protected void setFrameFeatures() which performs the following tasks
 * Set the window located at the center of the screen.
 * Set the window visible.
 * Exit the application using the System exit method when the user initiates a "close" on this frame.
 * Set the size of the window appropriate for all the components.
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 31 Janruary 2023
 */
package ritidet.paramita.lab7;

import javax.swing.*;

class MySimpleWindow extends JFrame {
    protected JButton cancelButton;
    protected JButton resetButton;
    protected JButton submitButton;
    protected JPanel mainPanel;
    protected JPanel buttonPanel;

    public MySimpleWindow(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public void setFrameFeatures() {
        this.pack();//Set the size of the window appropriate for all the components.
        this.setLocationRelativeTo(null);//set the window located at the center of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit the application using the System exit method when the user initiates a "close" on this frame.
        this.setVisible(true);//Set the window visible
    }

    protected void addComponents() {
        cancelButton = new JButton("Cancel");//create cancelButton
        resetButton = new JButton("Reset");//create resetButton
        submitButton = new JButton("Submit");//create submitButton
        mainPanel = new JPanel();//create mainPanel
        buttonPanel = new JPanel();//create buttonPanel
        buttonPanel.add(cancelButton);//add cancelButton to buttonPanel
        buttonPanel.add(resetButton);//add resetButton to buttonPanel
        buttonPanel.add(submitButton);//add submitButton to buttonPanel
        mainPanel.add(buttonPanel); //add buttonPanel to mainPanael
        this.getContentPane().add(mainPanel);//add mainPanael to frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}