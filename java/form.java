import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame implements ActionListener {
    JCheckBox javaCheckbox, pythonCheckbox, cppCheckbox;
    JButton submitButton, resetButton;
    JLabel detailsLabel;

    public form() {
        setTitle("Registration Form with Details");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        javaCheckbox = new JCheckBox("Java");
        pythonCheckbox = new JCheckBox("Python");
        cppCheckbox = new JCheckBox("C++");

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);

        detailsLabel = new JLabel("Details:");

        add(javaCheckbox);
        add(pythonCheckbox);
        add(cppCheckbox);
        add(new JLabel());
        add(submitButton);
        add(resetButton);
        add(new JLabel());
        add(new JLabel());
        add(detailsLabel);
        add(new JLabel());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            StringBuilder details = new StringBuilder("Selected Languages: ");
            if (javaCheckbox.isSelected()) {
                details.append("Java is paltform independent, ");
            }
            if (pythonCheckbox.isSelected()) {
                details.append("Python is paltform independent, ");
            }
            if (cppCheckbox.isSelected()) {
                details.append("C++ is paltform dependent, ");
            }
            // Removing the last comma and space
            if (details.length() > 0) {
                details.setLength(details.length() - 2);
            }
            detailsLabel.setText(details.toString());
        } else if (e.getSource() == resetButton) {
            javaCheckbox.setSelected(false);
            pythonCheckbox.setSelected(false);
            cppCheckbox.setSelected(false);
            detailsLabel.setText("Details:");
        }
    }

    public static void main(String[] args) {
        form form = new form();
        form.setVisible(true);
    }
}
