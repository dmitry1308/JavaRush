package ru.schepin.lambda.exercises;

public class Exercise3 {
    interface MyFunc<T> {
        boolean func(T n);
    }

    public static void main(String[] args) {
        MyFunc<Integer> myFunc =  n -> n >= 10 && n <= 20;
        myFunc.func(5);
    }
}
