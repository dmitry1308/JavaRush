package ru.schepin.otherExercises.anonymousСlass;

public abstract class MyClass {
    private int i;
    private int j;

    public MyClass(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public abstract int summa();
    public abstract void print();

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
