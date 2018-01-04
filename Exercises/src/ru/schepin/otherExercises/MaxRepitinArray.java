package ru.schepin.otherExercises;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MaxRepitinArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        int byteNumber = 0;

        try (FileInputStream stream = new FileInputStream(s)) {
            while (stream.available() > 0) {
                byteNumber = stream.read();
                list.add(byteNumber);
            }
        }

        Collections.sort(list);

        int popular = list.get(0);
        int prev = list.get(0);
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == prev) {
                count++;
            } else {
                if (count > maxCount) {
                    popular = list.get(i - 1);
                    maxCount = count;
                }
                prev = list.get(i);
                count = 1;
            }

        }
        int number = count > maxCount ? list.get(list.size() - 1) : popular;
        System.out.println(number);


    }
}
