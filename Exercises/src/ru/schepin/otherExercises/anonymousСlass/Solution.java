package ru.schepin.otherExercises.anonymousСlass;

public class Solution {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(5, 6) {
            @Override
            public int summa() {
                return getI() + getJ();
            }

            @Override
            public void print() {
                System.out.println(summa());
            }
        };


        myClass.print();
    }
}
