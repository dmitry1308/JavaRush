package ru.schepin.lambda;

public class ReferencesToMethodsOfInstance2 {
    interface IntPredicate {
        boolean test(MyIntPredicate mip, int n);
    }

    public static class MyIntPredicate {
        private int v;

        public MyIntPredicate(int n) {
            v = n;
        }

        public int getN() {
            return v;
        }

        boolean isFactor(int m) {
            return v % m == 0;
        }
    }

    public static void main(String[] args) {
        boolean result;

        int n = 12;
        MyIntPredicate myIntPredicate = new MyIntPredicate(n);

        IntPredicate ip = MyIntPredicate::isFactor;

        result = ip.test(myIntPredicate, 3);
        if (result) System.out.println(3 + " является делителем " + myIntPredicate.getN());
    }
}
