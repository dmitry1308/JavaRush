package ru.schepin.otherExercises.generics;

public class Example<T extends Number> {
    T ob;
    T[] vals;


    public Example(T ob, T[] vals) {
        this.ob = ob;
        this.vals = vals;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Example<Integer> example = new Example<>(10, arr);

        Example<?> arr1[] = new Example<?>[2];
        arr1[0] = example;



    }
}
