package ru.schepin.examplesThread.Thread2;

public class Solution {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("dima");

        for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }

        }
        System.out.println("Завершение основного потока");

    }
}
