package ru.schepin.otherExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimpleNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        int number = Integer.parseInt(s);


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println(number + " :простое число");
        } else {
            for (Integer integer : list) {
                System.out.println(integer + " ");
            }
        }
    }
}