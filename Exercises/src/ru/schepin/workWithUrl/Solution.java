package ru.schepin.workWithUrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader.close();

        String search = "?";
        int index = text.indexOf(search);

        String line = text.substring(index + 1);

        String[] array = line.split("&");
        for (int i = 0; i < array.length; i++) {
            String[] s1 = array[i].split("=");
            System.out.print(s1[0] + " ");
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            String[] s1 = array[j].split("=");
            try {
                if (s1[0].equals("obj")) {
                    double number = Double.parseDouble(s1[1]);
                    alert(number);
                }
            }catch (Exception e){
                alert(s1[1]);
            }
        }

    }


    private static void alert(double value) {
        System.out.println("double " + value);
    }

    private static void alert(String value) {
        System.out.println("String " + value);
    }
}
