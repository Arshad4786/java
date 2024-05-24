import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    JTextField loginIdField, passwordField, displayField;
    JButton okButton, resetButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        JLabel loginLabel = new JLabel("Login ID:");
        loginIdField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        okButton = new JButton("OK");
        okButton.addActionListener(this);
        resetButton = new JButton("RESET");
        resetButton.addActionListener(this);

        displayField = new JTextField();
        displayField.setEditable(false);

        add(loginLabel);
        add(loginIdField);
        add(passwordLabel);
        add(passwordField);
        add(okButton);
        add(resetButton);
        add(new JLabel());
        add(displayField);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            String loginId = loginIdField.getText();
            String password = passwordField.getText();
            displayField.setText("Login ID: " + loginId + " | Password: " + password);
        } else if (e.getSource() == resetButton) {
            loginIdField.setText("");
            passwordField.setText("");
            displayField.setText("");
        }
    }

    public static void main(String[] args) {
        RegistrationForm form = new RegistrationForm();
        form.setVisible(true);
    }
}
