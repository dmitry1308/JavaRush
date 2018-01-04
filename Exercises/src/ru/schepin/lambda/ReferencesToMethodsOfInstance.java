package ru.schepin.lambda;

public class ReferencesToMethodsOfInstance {
    interface IntPredicate {
        boolean test(int n);
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

        boolean hascommonFactor(Object v){
            return v instanceof Double;

        }
    }

    public static void main(String[] args) {
        boolean result;

        int n = 12;
        MyIntPredicate myIntPredicate = new MyIntPredicate(n);

        IntPredicate ip = myIntPredicate::isFactor;

        result = ip.test(3);
        if (result) System.out.println(3 + " является делителем " + myIntPredicate.getN());

        IntPredicate ip1=myIntPredicate::hascommonFactor;
        System.out.println(ip1.test(5));

    }


}
