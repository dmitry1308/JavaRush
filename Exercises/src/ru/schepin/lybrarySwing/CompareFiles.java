package ru.schepin.lybrarySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

public class CompareFiles implements ActionListener {
    JButton jButton;
    JLabel jfirst, jsecond, jinformation;
    JTextField jTextField1, jTextField2;

    public CompareFiles() {
        JFrame frame = new JFrame("Сравнение файлов");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 190);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jTextField1 = new JTextField(14);
        jTextField2 = new JTextField(14);
        jTextField1.setActionCommand("1");
        jTextField2.setActionCommand("2");


        jfirst = new JLabel("Первый файл: ");
        jsecond = new JLabel("Второй файл: ");

        jinformation = new JLabel("");

        jButton = new JButton("Сравнить");
        jButton.addActionListener(this);

        frame.add(jfirst);
        frame.add(jTextField1);
        frame.add(jsecond);
        frame.add(jTextField2);
        frame.add(jButton);
        frame.add(jinformation);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Файл отсутствует!");
            return;
        }

        if (jTextField2.getText().equals("")) {
            jTextField2.setText("Файл отсутствует!");
            return;
        }

        int i = 0, j = 0;

        try (FileInputStream stream1 = new FileInputStream(jTextField1.getText());
             FileInputStream stream2 = new FileInputStream(jTextField2.getText());) {

            do {
                i = stream1.read();
                j = stream2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);
            if (i != j) jinformation.setText("Файлы не одинаковы!");
            else
                jinformation.setText("Файлы одинаковы!");

        } catch (Exception e1) {
            jinformation.setText("File error");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CompareFiles::new);

    }
}
