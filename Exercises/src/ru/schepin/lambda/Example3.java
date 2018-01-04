package ru.schepin.lambda;

import static ru.schepin.lambda.Example3.LambdaArgumentDemo.changeStr;

public class Example3 {
    interface StringFunc {
        String func(String str);
    }

    public static class LambdaArgumentDemo {
        static String changeStr(StringFunc sf, String s) {
            return sf.func(s);
        }
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения расширяет Java";
        String outStr;

        System.out.println("Входная строка: " + inStr);

        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println(outStr);

        //Замена пробелов дефисами:
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println(outStr);

        //Изменение регистра:
        StringFunc changeRegistr = (str) -> {
            String result = "";
            char ch;

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isLowerCase(ch)) {
                    result += Character.toUpperCase(ch);
                } else
                    result += ch;
            }
            return result;
        };
        outStr = changeStr(changeRegistr, inStr);
        System.out.println(outStr);
    }
}
