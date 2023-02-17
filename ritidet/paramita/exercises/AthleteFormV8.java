package ritidet.paramita.exercises;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;

public class AthleteFormV8 extends ritidet.paramita.lab7.AthleteForm implements ActionListener {
    protected String nameMessage, weightMessage, heightMessage, birthDateMessage, showMessage;
    
    public AthleteFormV8(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV8 msw = new AthleteFormV8("Athlete Form V8");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void addComponents() {
        super.addComponents();
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        nameMessage = nameField.getText();
        weightMessage = weightField.getText();
        heightMessage = heightField.getText();
        birthDateMessage = birthDateField.getText();
        showMessage = "Name: " + nameMessage + " Weight: " + weightMessage + " Height: " + heightMessage + " Birthday: " + birthDateMessage;
        JOptionPane.showMessageDialog(this, showMessage, "Massege", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}