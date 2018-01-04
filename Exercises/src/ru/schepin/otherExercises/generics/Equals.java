package ru.schepin.otherExercises.generics;

public class Equals {
    static <T extends Comparable<T>, V extends T> boolean arraysEquals(T[] a, T[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = {5, 6, 7};
        Integer[] b = {5, 6, 7};

        boolean b1 = arraysEquals(a, b);
        System.out.println(b1);

    }
}
