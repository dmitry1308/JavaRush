package ru.schepin.otherExercises;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");

        } catch (FileNotFoundException e) {
            System.out.println("Игнорировать отсутствие файла!");
        }

        try {
            if (fin != null) {
                properties.load(fin);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла!");
        }

        do {
            System.out.println("Введите имя: ");
            name = reader.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Введите номер");
            number = reader.readLine();
            properties.put(name, number);
            changed = true;
        } while (!name.equals("выход"));

        if (changed) {
            FileWriter outputStream = new FileWriter("phonebook.dat");
            properties.store(outputStream, "Телефонная книга");
            outputStream.close();
        }

        do {
            System.out.println("Ввудите имя для поиска: ");
            name = reader.readLine();
            number = (String) properties.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
