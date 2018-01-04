package ru.schepin.otherExercises;

public class Swap {
    private int a;

    public Swap() {
    }

    public Swap(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public static class Change {
        public static void change(Swap a, Swap b) {
            int aa=a.getA();
            int bb=b.getA();

            int temp;

            temp = aa;
            aa = b.getA();
            bb = temp;
        }
    }


    public static void main(String[] args) {
        Swap swap2 = new Swap(2);
        Swap swap3 = new Swap(3);
        Change.change(swap2, swap3);
        System.out.println(swap2.getA());
    }
}
