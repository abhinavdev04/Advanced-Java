package lab1;

//Q4 WAP a java program to demonstrate mouse events such as mouseClicked, mousePressed, mouseReleased, mouseEntered, and mouseExited.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q4 extends JFrame implements MouseListener {

    JLabel label;

    q4() {
        setTitle("Mouse Events");
        setSize(400, 300);
        setLayout(new FlowLayout());

        label = new JLabel("Perform a mouse event");

        add(label);

        addMouseListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Mouse clicked event
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    // Mouse pressed event
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    // Mouse released event
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    // Mouse entered event
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    // Mouse exited event
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new q4();
    }
}