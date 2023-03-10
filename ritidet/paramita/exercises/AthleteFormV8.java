package ritidet.paramita.exercises;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import ritidet.paramita.lab8.AthleteFormV6;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    protected String nameMessage, weightMessage, heightMessage, birthDateMessage, showMessage;
    protected String newline = "\n";

    public AthleteFormV8(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV8 msw = new AthleteFormV8("Athlete Form V8");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public void addComponents() {
        super.addComponents();
        submitButton.addActionListener(this);
    }

    public void getUserValues() {
        nameMessage = "Name: " + nameField.getText() + newline;
        weightMessage = "Weight: " + weightField.getText() + newline;
        heightMessage = "Height: " + heightField.getText() + newline;
        birthDateMessage = "Date of Birth: " + birthDateField.getText() + newline;
        showMessage = nameMessage + weightMessage + heightMessage + birthDateMessage;
    } 

    public void actionPerformed(ActionEvent e) {
        getUserValues();
        if (e.getSource() == submitButton) {
            JOptionPane.showMessageDialog(null, showMessage);
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