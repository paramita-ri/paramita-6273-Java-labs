package ritidet.paramita.simpleform;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class SimpleFormV6 extends SimpleFormV5 implements ActionListener{
    public SimpleFormV6(String title) {
        super(title);
    }
    public static void createAndShowGUI() {
        SimpleFormV6 window = new SimpleFormV6("SimpleFormV6");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }
    public void addListeners(){
        super.addListeners();
        openMI.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == openMI) {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Opening " + selectedFile.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Open file cancelled by the user");
            }
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
