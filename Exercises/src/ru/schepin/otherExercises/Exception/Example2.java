package ru.schepin.otherExercises.Exception;

public class Example2 {

    static void procA() {
        try {
            System.out.println("procA");
            throw new RuntimeException("Demo");
        } finally {
            System.out.println("finally procA");
        }
    }

    static void procB() {
        try {
            System.out.println("procB");
        } finally {
            System.out.println("finally procB");
        }
    }

    static void procC() {
        try {
            System.out.println("procC");
        } finally {
            System.out.println("finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception ex) {
            System.out.println("Exception was caught");
            ex.printStackTrace(System.out);
        }
        procB();
        procC();
    }

}
