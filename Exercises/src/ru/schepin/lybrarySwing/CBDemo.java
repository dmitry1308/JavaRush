package ru.schepin.lybrarySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CBDemo implements ItemListener {
    JLabel jLabSelected, jlabChanged;
    JCheckBox jcbtea, jcbCoffee, jcbVodka;

    public CBDemo() {
        JFrame jFrame = new JFrame("Программа выбора напитка");
        jFrame.setSize(280, 120);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        jcbtea = new JCheckBox("Чай");
        jcbCoffee = new JCheckBox("Кофе");
        jcbVodka = new JCheckBox("Водка");

        jcbtea.addItemListener(this);
        jcbCoffee.addItemListener(this);
        jcbVodka.addItemListener(this);

        jFrame.add(jcbtea);
        jFrame.add(jcbCoffee);
        jFrame.add(jcbVodka);
        jFrame.add(jlabChanged);
        jFrame.add(jLabSelected);

        jFrame.setVisible(true);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";

        JCheckBox cb = (JCheckBox) e.getItem();

        if (cb.isSelected()) {
            jlabChanged.setText(cb.getText() + " был выбран.");
        } else {
            jlabChanged.setText(cb.getText() + " был отменен.");
        }

        if (jcbtea.isSelected()) {
            str += "чай, ";
        }
        if (jcbCoffee.isSelected()) {
            str += "кофе, ";
        }
        if (jcbVodka.isSelected()) {
            str += "водка";
        }
        jLabSelected.setText("Выбраны напитки: " + str);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CBDemo::new);


    }
}
