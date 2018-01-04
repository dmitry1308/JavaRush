package ru.schepin.examplesThread.TickTock;

public class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }

    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {
                try {
                    ttOb.tick(true);
                    ttOb.tick(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        } else {
            for (int i = 0; i < 5; i++) {
                try {
                    ttOb.tock(true);
                    ttOb.tock(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
