package ru.schepin.lambda;

public class ReferencesToStaticMetods {
    interface IntPredicate {
        boolean test(int n);
    }

    static class MyIntPredicates {
        static boolean ispPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i < n / i; i++) {
                if ((n % i) == 0) return false;
            }
            return true;
        }

        static boolean isEven(int n) {
            return (n % 2 == 0);
        }

        static boolean isPositive(int n) {
            return n > 0;
        }
    }

    static class MethodRefDemo {
        static boolean numTest(IntPredicate p, int v) {
            return p.test(v);
        }
    }

    public static void main(String[] args) {
        boolean result;

        result = MethodRefDemo.numTest(MyIntPredicates::ispPrime, 17);
        if (result) System.out.println("17 - простое число");

        result = MethodRefDemo.numTest(MyIntPredicates::isEven, 6);
        if (result) System.out.println("6 - четное число");

        result = MethodRefDemo.numTest(MyIntPredicates::isPositive, 5);
        if (result) System.out.println("5 - положительнео число ");

    }
}
