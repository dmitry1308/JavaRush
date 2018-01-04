package ru.schepin.otherExercises.comparator.example1.Example2;

import java.util.Comparator;

public class CompareName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
