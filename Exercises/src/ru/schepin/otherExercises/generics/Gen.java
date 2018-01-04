package ru.schepin.otherExercises.generics;

public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public void getArgument(Gen<? extends A> o) {

    }

    @Override
    public String toString() {
        return "Gen{" +
                "ob=" + ob +
                '}';
    }

    public T getOb() {
        return ob;
    }


    static class A {

    }

    static class B extends A {
    }

    static class C extends B {
    }

    static class D {
    }



    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<?> ff = new Gen<>(5);

        System.out.println(ff);

    }
}
