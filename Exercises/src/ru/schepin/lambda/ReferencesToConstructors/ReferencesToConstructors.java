package ru.schepin.lambda.ReferencesToConstructors;

public class ReferencesToConstructors {
    interface MyFunct {
        MyClass func(String s);
    }

     class MyClass {
        private String str;


        public MyClass(String st) {
            str = st;
        }

        public String getStr() {
            return str;
        }
    }



}

