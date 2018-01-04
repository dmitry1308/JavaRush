package ru.schepin.otherExercises.generics.Queue;

public class GenQueue<T> implements IGenQ<T> {
    private T[] q;
    private int putloc, getloc;

    public GenQueue(T[] q ) {
        this.q = q;
        putloc = getloc = 0;
    }



    @Override
    public void put(T ch) throws QueueFullException {
        if (putloc == q.length - 1)
            throw new QueueFullException(q.length);
        q[putloc++] = ch;
    }

    @Override
    public T get() throws QueueEmptyException {
        if (getloc == putloc) throw new QueueEmptyException();
        getloc = 0;
        T number = q[getloc++];

        for (int i = 1; i <= putloc-1; i++) {
            q[i] = q[i + 1];
        }
        putloc--;


        return number;
    }

}
