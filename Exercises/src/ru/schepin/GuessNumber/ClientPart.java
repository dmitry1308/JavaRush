package ru.schepin.GuessNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientPart implements Runnable {
    @Override
    public void run() {
        GamePart gamePart = new GamePart(8, 100);
        System.out.println("Игра: Угадай число!");
        System.out.println("Условия игры: ");
        System.out.println("Число попыток: " + gamePart.getMaxNumberOfTries() + ", интервал числа: от 0 до " + gamePart.getMaxNumber() + ".");
        System.out.println();
        loop:
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число Сэр: ");
            while (true) {
                String line = reader.readLine();
                if (line == null) continue;

                int number = 0;
                try {
                    number = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число. Попробуйте еще раз: ");
                }

                RatioToNumber resultOfTry = gamePart.doTry(number);
                switch (resultOfTry) {
                    case EQUALLY:
                        System.out.println("Вы выиграли! ");
                        System.out.println("Число попыток: " + gamePart.getNumberOfTries());
                        System.out.println("Угаданное число: " + gamePart.getRandomNumber());
                        break;
                    case LESS:
                        System.out.println("Мало (введите больше число): ");
                        break;
                    case MORE:
                        System.out.println("Много (введите меньше число): ");
                        break;
                    case FAIL:
                        System.out.println("Вы проиграли: ");
                        System.out.println("Число попыток: " + gamePart.getRandomNumber());
                        System.out.println("Загаданное число: " + number);
                        break loop;
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
