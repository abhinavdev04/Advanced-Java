package lab1;

//Q3 WAP a java program to demonstrate ActionListener, MouseListener and KeyListener.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q3 extends JFrame implements ActionListener, MouseListener, KeyListener {

    JButton button;
    JTextField textField;
    JLabel label;

    q3() {
        setTitle("Event Demonstration");
        setSize(400, 300);
        setLayout(new FlowLayout());

        button = new JButton("Click Me");
        textField = new JTextField(15);
        label = new JLabel("Perform an event");

        add(button);
        add(textField);
        add(label);

        button.addActionListener(this);
        button.addMouseListener(this);
        textField.addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ActionListener: Handles button click event
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked");
    }

    // MouseListener: Handles mouse events
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    // KeyListener: Handles keyboard events
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed");
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released");
    }

    public static void main(String[] args) {
        new q3();
    }
}