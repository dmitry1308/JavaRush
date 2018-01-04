package ru.schepin.GuessNumber;

import java.util.Random;

public class GamePart  {
    private int numberOfTries;
    private final int maxNumberOfTries;
    private int randomNumber;
    private int maxNumber;


    public GamePart(int maxNumberOfTries, int maxNumber) {
        this.maxNumberOfTries = maxNumberOfTries;
        this.randomNumber = new Random().nextInt(maxNumber) + 1;
        this.maxNumber=maxNumber;
    }

    public RatioToNumber doTry(int number) {
        numberOfTries++;
        if (numberOfTries > maxNumberOfTries) {
            return RatioToNumber.FAIL;
        }
        if (number < randomNumber) {
            return RatioToNumber.LESS;
        }
        if (number > randomNumber) {
            return RatioToNumber.MORE;
        }
        return RatioToNumber.EQUALLY;
    }


    public int getNumberOfTries() {
        return numberOfTries;
    }

    public int getMaxNumberOfTries() {
        return maxNumberOfTries;
    }

    public int getRandomNumber() {
        return randomNumber;
    }


    public int getMaxNumber() {
        return maxNumber;
    }
}
