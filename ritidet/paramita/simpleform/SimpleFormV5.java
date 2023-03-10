package ritidet.paramita.simpleform;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class SimpleFormV5 extends SimpleFormV4 implements ListSelectionListener {
    public SimpleFormV5(String title) {
        super(title);
    }
    public static void createAndShowGUI() {
        SimpleFormV5 window = new SimpleFormV5("SimpleFormV5");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    public void addListeners() {
        hobbiesLst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        hobbiesLst.addListSelectionListener(this); 
    }

    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting();
        String messageHB = "";

        if (!isAdjusting) {
            List<String> selectedHB = hobbiesLst.getSelectedValuesList();
            int selectedNum = selectedHB.size();
            for (int i = 0; i < selectedNum; i++) {
                messageHB += selectedHB.get(i) + " ";
            }
            JOptionPane.showMessageDialog(this, messageHB);
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
