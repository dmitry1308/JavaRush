package ru.schepin.otherExercises;

import java.io.IOException;

public class SimpleNumbers {
    public static void main(String[] args) throws IOException {
        //   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // String s = bufferedReader.readLine();
        //int number = Integer.parseInt(s);
        boolean isSimoleNumber;
        int i, j;
        for (i = 2; i < 100; i++) {
            isSimoleNumber = true;
            for (j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    isSimoleNumber = false;
                    break;
                }
            }
            if (isSimoleNumber) {
                System.out.print(i + " ");
            }
        }


    }

}