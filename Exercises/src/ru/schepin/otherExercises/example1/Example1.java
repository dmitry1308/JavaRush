package ru.schepin.otherExercises.example1;

public class Example1 {
    public static int sum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }


}
