package ru.schepin.lambda;

public class Example2 {
    public static void main(String[] args) {
        NumericFunc numericFunc = (n) -> {
            int result = 1;

            n = n < 0 ? -n : n;

            for (int i = 2; i < n / i; i++) {
                if (n % 2 == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };

        int a = numericFunc.func(11);
        System.out.println(a);
    }

    interface NumericFunc {
        int func(int n);
    }
}
