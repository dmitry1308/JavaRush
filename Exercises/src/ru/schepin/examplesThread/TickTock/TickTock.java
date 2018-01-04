package ru.schepin.examplesThread.TickTock;

public class TickTock {
    String state;

    synchronized void tick(boolean running) throws InterruptedException {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick");
        Thread.sleep(500);

        state = "ticked";

        notify();

        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("прерывание потока");
        }
    }


    synchronized void tock(boolean running) throws InterruptedException {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");
        Thread.sleep(500);

        state = "tocked";

        notify();

        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("прерывание потока");
        }
    }
}
