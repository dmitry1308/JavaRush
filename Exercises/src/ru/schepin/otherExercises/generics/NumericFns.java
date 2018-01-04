package ru.schepin.otherExercises.generics;

public class NumericFns<T extends Number> {
    private T num;

    public NumericFns(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public boolean absEquals(NumericFns<?> ob) {
       return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }

    public static void main(String[] args) {
        NumericFns<Integer> fns1 = new NumericFns<>(5);
        NumericFns<Double> fns2 = new NumericFns<>(6.0);

        fns1.absEquals(fns2);

    }

}
