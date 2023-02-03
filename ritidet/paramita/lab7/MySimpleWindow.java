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

    protected void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    protected void addComponents() {
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");
        mainPanel = new JPanel();
        buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        mainPanel.add(buttonPanel);
        this.getContentPane().add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}