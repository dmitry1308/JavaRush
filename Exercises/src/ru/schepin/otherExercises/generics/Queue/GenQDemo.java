package ru.schepin.otherExercises.generics.Queue;

public class GenQDemo {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        Integer[] iStore = new Integer[10];
        GenQueue<Integer> queue = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Демонстрация очереди чисел типа Integer");
        int x=0;
        try {
            for (int i = 0; i < iStore.length-1; i++) {
                x++;
                System.out.println("Добавление " + x + " в очередь q");
                queue.put(i);
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        Integer a = queue.get();
        queue.put(25);

        for (Integer integer : iStore) {
            System.out.println(integer);
        }

    }
}
