package ru.schepin.otherExercises;

public class Queue {
    private String[] line;
    private int putLoc, getLoc;

    public Queue(int size) {
        line = new String[size + 1];
        putLoc = getLoc = 0;
    }

    public void put(String name){
        if (putLoc==line.length-1){
            System.out.println("Память заполнена!");
            return;
        }

        putLoc++;
        line[putLoc]=name;
    }

    public String get() {
        if (putLoc==getLoc){
            System.out.println("Очередь пуста!");
        }

        getLoc++;
        return line[getLoc];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.put("Dima");
        queue.put("Vera");
        queue.put("Kate");

        queue.get();
        queue.put("Yura");
    }
}
