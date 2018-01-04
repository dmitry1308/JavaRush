package ru.schepin.lybrarySwing;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    public SwingDemo() {
        JFrame jFrame = new JFrame("Приложение Щепина Дмитрия");
        jFrame.setSize(275, 100);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JLabel jLabel = new JLabel("Мое первое приложение");
        jFrame.add(jLabel, BorderLayout.CENTER);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingDemo::new);
    }

}
