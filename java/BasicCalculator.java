import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
    };

    private double firstNumber, secondNumber, result;
    private char operator;

    public BasicCalculator() {
        setTitle("Basic Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setEditable(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        buttons = new JButton[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("=")) {
            secondNumber = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber != 0)
                        result = firstNumber / secondNumber;
                    else
                        result = 0; // Handling division by zero
                    break;
            }
            textField.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            textField.setText("");
        } else {
            operator = command.charAt(0);
            firstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        calculator.setVisible(true);
    }
}
