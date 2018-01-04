package ru.schepin.examplesThread.Priority;

public class Solution {
    public static void main(String[] args) {
        Priority myThread = new Priority("High Priority");
        Priority myThread1 = new Priority("Low Priority");

        myThread.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        myThread1.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        myThread.thrd.start();
        myThread1.thrd.start();


        try {
            myThread.thrd.join();
            myThread1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }

        System.out.println("\nСчетчик потока High Priority: " + myThread.count);
        System.out.println("Счетчик потока Low Priority: " + myThread1.count);

    }
}
