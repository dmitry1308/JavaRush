package ru.schepin.otherExercises.comparator.example1.Example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Solution1 {
    public static void main(String[] args) {
        Person dima = new Person("Dima", 31);
        Person vera = new Person("Vera", 56);
        Person yana = new Person("Dima", 26);

        ComparePerson comparePerson = new ComparePerson();
        CompareName compareName = new CompareName();
        TreeSet<Person> list = new TreeSet<>(comparePerson);
        list.add(dima);
        list.add(vera);
        list.add(yana);

        for (Person person : list) {
            System.out.println(person);
        }

        System.out.println();

        ArrayList<Person> list1 = new ArrayList<>();
        Collections.addAll(list1, new Person("vasa", 10),
                new Person("Kate", 9),
                new Person("petr", 15),
                new Person("petr", 20));

        list1.sort(compareName.thenComparing(compareName));
        for (Person person : list1) {
            System.out.println(person);
        }
    }
}
