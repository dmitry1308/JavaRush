package ru.schepin.examplesThread.Thread3;

public class Solution {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("dima");
        MyThread myThread1 = new MyThread("dima1");
        MyThread myThread2 = new MyThread("dima2");

        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }

        } while (myThread.isAlive() ||
                myThread1.isAlive() ||
                myThread2.isAlive());
        System.out.println("Завершение основного потока");

    }
}
