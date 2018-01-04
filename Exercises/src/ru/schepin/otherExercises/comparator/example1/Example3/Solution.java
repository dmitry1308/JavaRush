package ru.schepin.otherExercises.comparator.example1.Example3;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] arr = {"Vasa", "Ania", "Yuri", "Dima"};
        Arrays.sort(arr, new StringComparator());

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
