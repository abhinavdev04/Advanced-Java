package lab1;

//Q2 WAP using awt to create a simple calculator using Jframe,Jtext and button.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends JFrame implements ActionListener {

    JTextField display;
    double num1;
    char op;

    q2() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());
        setResizable(false);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 25));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "C", "/", "*", "-",
            "7", "8", "9", "+",
            "4", "5", "6", "=",
            "1", "2", "3", "0",
            ".", "", "", ""
        };

        for (String s : buttons) {
            JButton b = new JButton(s);
            b.setFont(new Font("Arial", Font.BOLD, 20));
            b.addActionListener(this);
            p.add(b);
        }

        add(p, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if (s.equals("C")) {
            display.setText("");
        }
        else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            op = s.charAt(0);
            display.setText(num1 + " " + op);
        }
        else if (s.equals("=")) {
            String text = display.getText();
            double num2 = Double.parseDouble(text.substring(text.lastIndexOf(" ") + 1));

            double result = 0;

            if (op == '+')
                result = num1 + num2;
            else if (op == '-')
                result = num1 - num2;
            else if (op == '*')
                result = num1 * num2;
            else if (op == '/')
                result = num1 / num2;

            display.setText("" + result);
        }
        else {
            if (display.getText().contains(" " + op)) {
                display.setText(display.getText() + " " + s);
            }
            else {
                display.setText(display.getText() + s);
            }
        }
    }

    public static void main(String[] args) {
        new q2();
    }
}