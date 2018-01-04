package ru.schepin.otherExercises;

import ru.schepin.otherExercises.comparator.example1.Example1.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        FileReader in = new FileReader("input.txt");
        String[] array = loadAndSort(in);


        for (String s : array) {
            System.out.println(s);
        }

        Person person = new Person("Nik", 27);
        //  Person dima=(Person) Class.forName("Person").newInstance();
        // System.out.println(dima.getName());
    }

    public static String[] loadAndSort(FileReader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                list.add(line);
            }
        }
        reader.close();
        String[] array = list.toArray(new String[list.size()]);
        Arrays.sort(array);
        return array;
    }


}

