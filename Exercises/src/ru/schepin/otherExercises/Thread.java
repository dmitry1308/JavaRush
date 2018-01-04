package ru.schepin.otherExercises;

public class Thread {
    static class Store {
        int count;

        public synchronized void put() {
            count++;
            System.out.println("p Положил!");
            notify();
        }

        public synchronized void get() {
            while (true)
                if (count > 0) {
                    count--;
                    System.out.println("с получил!");
                    return;
                } else
                    try {
                        wait();
                        System.out.println("с ждет пополнения!");
                    } catch (InterruptedException e) {
                        System.out.println("Ошибка!");
                    }
        }
    }


    static class Consumer extends Thread {
        Store s;

        Consumer(Store s) {
            super();
            this.s = s;
        }

        public void run() {
            s.get();
        }
    }

    static class Producer extends Thread {
        Store s;

        Producer(Store s) {
            super();
            this.s = s;
        }

        public void run() {
            s.put();
        }
    }

    public static void main(String[] args) {
        Store s = new Store();
        Consumer c = new Consumer(s);
        Producer p = new Producer(s);
        c.run();
        p.run();
    }
}
