package ru.schepin.examplesThread.Thread1;

public class Example1 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("dima");
        MyThread myThread2 = new MyThread("Roma");
        MyThread myThread3 = new MyThread("Vera");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }

        }
        System.out.println("Завершение основного потока");

    }
}
