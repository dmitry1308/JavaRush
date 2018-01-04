package ru.schepin.lambda;

public class Example1 {
    public static void main(String[] args) {
        MyValue myValue;
        myValue = () -> 98.6;
        System.out.println(myValue.getValue());

        MyParamValue param = (n) -> 1.0 / n;
        System.out.println(param.getValue(10));

        Test test = new Test();
        test.getValue(10);


        StringTest stringTest = (a, b) -> a.indexOf(b) != -1;
        String s = "Это тест";
        String k = "тест";

        boolean l = stringTest.test(s, k);
        System.out.println(l);

    }

    public static class Test implements MyParamValue {

        @Override
        public double getValue(double v) {
            return 1 / v;
        }
    }

    interface MyValue {
        double getValue();
    }

    interface MyParamValue {
        double getValue(double v);
    }

    interface StringTest {
        boolean test(String a, String b);
    }
}
