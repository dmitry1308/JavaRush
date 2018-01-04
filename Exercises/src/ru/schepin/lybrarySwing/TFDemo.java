package ru.schepin.lybrarySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFDemo implements ActionListener {
    JTextField jtf;
    JButton jbtRev;
    JLabel jLabPromt, jlabContents;

    public TFDemo() {
        JFrame jFrame = new JFrame("Use a text field");

        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(240, 120);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");

        JButton jbtRev = new JButton("Reverse");

        jtf.addActionListener(this);
        jbtRev.addActionListener(this);

        jLabPromt = new JLabel("Enter next: ");
        jlabContents = new JLabel("");

        jFrame.add(jLabPromt);
        jFrame.add(jtf);
        jFrame.add(jbtRev);
        jFrame.add(jlabContents);

        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reverse")) {
            String orgStr = jtf.getText();
            String resStr = "";

            for (int i = orgStr.length() - 1; i >= 0; i--) {
                resStr += orgStr.charAt(i);
            }
            jtf.setText(resStr);
        } else {
            jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(TFDemo::new);
    }
}
