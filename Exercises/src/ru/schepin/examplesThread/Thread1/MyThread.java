package ru.schepin.examplesThread.Thread1;

public class MyThread implements Runnable {
    private Thread thrd;

    public MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }


    public void run() {
        System.out.println(thrd.getName() + " -запуск");

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счетчик: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " - пркрван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}
