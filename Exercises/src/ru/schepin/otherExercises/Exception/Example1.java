package ru.schepin.otherExercises.Exception;

public class Example1 {
    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.letsDoIt();
        } catch (Exception e) {
            System.out.println("Second printStackTrace:");
            e.printStackTrace(System.out);
        }
    }
}
