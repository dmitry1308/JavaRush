package ru.schepin.otherExercises;

public class Recursiy {
    int Factorial(int n) {
        int result;
        if (n == 1) return  1;
        result = Factorial(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Recursiy recursiy = new Recursiy();
        int a = recursiy.Factorial(4);
        System.out.println(a);
    }
}
