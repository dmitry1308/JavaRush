package ru.schepin.examplesThread.Thread3;

public class MyThread extends Thread {


    public MyThread(String name) {
        super(name);
        start();
    }


    public void run() {
        System.out.println(getName() + " -запуск");

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("B " + getName() + ", счетчик: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " - пркрван");
        }
        System.out.println(getName() + " - завершение");
    }
}
