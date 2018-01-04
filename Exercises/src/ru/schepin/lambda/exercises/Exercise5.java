package ru.schepin.lambda.exercises;

public class Exercise5 {
    interface Test {
        int test(int n);
    }


    static class MyClass {
        static int myStaticMethod(int n) {
            return n * 5;
        }

        static int myStaticMethod1(int n) {
            return n * 10;
        }
    }

    static class Method{
        static int testMethod(Test a, int n){
            return a.test(n);
        }
    }

    public static void main(String[] args) {
        int a= Method.testMethod(MyClass::myStaticMethod,5);
        System.out.println(a);

        int b= Method.testMethod(MyClass::myStaticMethod1,6);
        System.out.println(b);
    }
}
