package ru.schepin.examplesThread.TickTock;


public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread tick = new MyThread("Tick", tt);
        MyThread tock = new MyThread("Tock", tt);

        try {
            tick.thrd.join();
            tock.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("прерывание основного потока");
        }

    }
}
