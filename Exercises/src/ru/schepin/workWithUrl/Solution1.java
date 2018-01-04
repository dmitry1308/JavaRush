package ru.schepin.workWithUrl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();

        try (FileInputStream stream = new FileInputStream(s);
             Scanner scanner = new Scanner(stream, "windows-1251");

             FileInputStream stream1 = new FileInputStream(s1);
             Scanner scanner1 = new Scanner(stream1, "windows-1251")) {

            while (scanner.hasNextLine()) {
                allLines.add(scanner.nextLine());
            }
            while (scanner1.hasNextLine()) forRemoveLines.add(scanner1.nextLine());


        }
        try {
            Solution1 solution = new Solution1();
            solution.joinData();
            if (!allLines.isEmpty()) throw new CorruptedDataException();

        } catch (CorruptedDataException e) {
            allLines.clear();
        }

        bufferedReader.close();
    }

    public void joinData() throws CorruptedDataException {
        allLines.removeAll(forRemoveLines);
    }


}
