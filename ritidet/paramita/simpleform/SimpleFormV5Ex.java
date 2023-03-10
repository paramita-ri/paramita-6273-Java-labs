package ritidet.paramita.simpleform;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SimpleFormV5Ex extends SimpleFormV4 implements ChangeListener{
    protected JSlider numslider;
    protected JPanel sliderPanel;

    public SimpleFormV5Ex(String title) {
        super(title);
    }
    public static void createAndShowGUI() {
        SimpleFormV5Ex window = new SimpleFormV5Ex("SimpleFormV5Ex");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    public void addComponents(){
        super.addComponents();
        numslider = new JSlider(0,10,1);
        numslider.setMajorTickSpacing(2);
        numslider.setMinorTickSpacing(1);
        numslider.setPaintTicks(true);
        numslider.setPaintLabels(true);
        numslider.setValue(5);
        sliderPanel = new JPanel();
        sliderPanel.add(numslider);
        contentBottomPanel.add(sliderPanel, BorderLayout.CENTER);
    }

    public void addListeners() {
        numslider.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent event) {
        JSlider gs = (JSlider) event.getSource();
        if(!gs.getValueIsAdjusting()){
            int gvalue = gs.getValue();
            JOptionPane.showMessageDialog(this, gvalue);
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