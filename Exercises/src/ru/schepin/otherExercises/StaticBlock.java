package ru.schepin.otherExercises;

public class StaticBlock {
    static int a = 5;
    static int b = 6;
    static int c = 6;

    static {
        c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
