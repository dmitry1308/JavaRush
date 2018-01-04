package ru.schepin.lybrarySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener {
    JLabel jlab;

    public ButtonDemo() {
        JFrame jFrame = new JFrame("A Button Example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(220, 90);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton down = new JButton("Down");
        JButton up = new JButton("Up");

        up.addActionListener(this);
        down.addActionListener(this);

        jFrame.add(up);
        jFrame.add(down);

        jlab = new JLabel("Press a button");
        jFrame.add(jlab);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Up")) {
            jlab.setText("You pressed up");
        } else {
            jlab.setText("You pressed down");

        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonDemo::new);
    }

}

