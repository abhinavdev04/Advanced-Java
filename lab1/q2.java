package lab1;
//Q2 WAP using awt to create a simple calculator using Jframe,Jtext and button.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends JFrame implements ActionListener {

    JTextField t1, t2, result;
    JButton add, sub, mul, div;

    q2() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new FlowLayout());

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add(new JLabel("Number 1:"));
        add(t1);

        add(new JLabel("Number 2:"));
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new JLabel("Result:"));
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double r = 0;

        if (e.getSource() == add)
            r = a + b;
        else if (e.getSource() == sub)
            r = a - b;
        else if (e.getSource() == mul)
            r = a * b;
        else if (e.getSource() == div)
            r = a / b;

        result.setText(String.valueOf(r));
    }

    public static void main(String[] args) {
        new q2();
    }
}