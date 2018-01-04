package ru.schepin.lambda.exercises;

import static ru.schepin.lambda.exercises.Exercise4.LambdaArgumentDemo.changeStr;

public class Exercise4 {
    interface StringFunc {
        String func(String str);
    }

    static class LambdaArgumentDemo {
        static String changeStr(StringFunc sf, String s) {
            return sf.func(s);
        }
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения расширяет Java";
        String outStr;

        System.out.println("Входная строка: " + inStr);


        //Замена пробелов дефисами:
        StringFunc stringFunc=(str) -> str.replaceAll(" ", "");
        outStr = changeStr(stringFunc, inStr);
        System.out.println(outStr);



    }
}
