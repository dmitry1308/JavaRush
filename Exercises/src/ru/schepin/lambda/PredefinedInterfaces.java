package ru.schepin.lambda;

import java.util.function.Predicate;

public class PredefinedInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        boolean c = isEven.test(6);
        if (c) System.out.println(6 + " четное число");
    }
}
