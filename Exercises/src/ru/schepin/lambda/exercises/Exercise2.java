package ru.schepin.lambda.exercises;

public class Exercise2 {
    interface NumericFunc {
        int getFactorial(int n);
    }

    public static void main(String[] args) {
        NumericFunc numericFunc = (n) -> {
            int fact = 1;
            for (int i = 2; i <= n; i++)
                fact *= i;
            return fact;
        };

        int factorial = numericFunc.getFactorial(4);
        System.out.println(factorial);
    }


}
