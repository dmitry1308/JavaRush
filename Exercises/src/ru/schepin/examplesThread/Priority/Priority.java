package ru.schepin.examplesThread.Priority;

public class Priority implements Runnable {
    Thread thrd;
    int count;

    static boolean stop = false;
    static String currentName;

    public Priority(String name) {
        thrd = new Thread(this, name);
        currentName = name;
        count = 0;
    }


    public void run() {
        System.out.println(thrd.getName() + " -запуск");
        do {
            count++;

            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("B " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " - завершение");
    }
}
