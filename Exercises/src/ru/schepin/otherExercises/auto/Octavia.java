package ru.schepin.otherExercises.auto;

public class Octavia extends Auto {
    private final double petrolConsumptionOn100Km = 8;

    public Octavia() {

    }

    public Octavia(double km) {
        super(km);
    }

    public double getPriceOfTravel() {
        return getPriceOn100Km() * getKm() / 100;
    }

    public double getPriceOfTravel(double km) {
        return getPriceOn100Km() * km / 100;
    }

    private double getPriceOn100Km() {
        return petrolConsumptionOn100Km * petrolPrice;
    }


}
