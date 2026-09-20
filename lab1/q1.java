package lab1;
//Q1 WAP using awt to create a simple button and label.
import java.awt.*;
import java.awt.event.*;

public class q1 extends Frame implements ActionListener {

    Button b;
    Label l;

    q1() {
        b = new Button("Click Me");
        l = new Label(" ");

        b.setBounds(100, 100, 80, 30);
        l.setBounds(100, 150, 200, 30);

        add(b);
        add(l);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(300, 250);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new q1();
    }
}