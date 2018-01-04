package ru.schepin.otherExercises.generics.Queue;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int s) {
        size = s;
    }


    @Override
    public String toString() {
        return "\nОчередь заполнена";
    }
}
