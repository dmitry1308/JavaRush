package ru.schepin.otherExercises.comparator.example1.Example1;

import java.util.TreeSet;

public class Solution1 {
    public static void main(String[] args) {
        Person dima = new Person("Dima", 31);
        Person vera = new Person("Vera", 56);
        Person yana = new Person("Dima", 26);

        TreeSet<Person> list = new TreeSet<>();
        list.add(dima);
        list.add(vera);
        list.add(yana);

        for (Person person : list) {
            System.out.println(person);
        }


    }
}
