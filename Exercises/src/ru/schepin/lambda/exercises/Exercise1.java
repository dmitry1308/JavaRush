package ru.schepin.lambda.exercises;

public class Exercise1 {
    interface Scope {
        boolean IsbelongsToBorder(int n);
    }

    public static void main(String[] args) {
        Scope scope = n -> (n >= 10 && n <= 20);
        int n = 11;
        boolean c = scope.IsbelongsToBorder(n);
        if (c) System.out.println(n + " принадлежит диапозону");

    }
}
