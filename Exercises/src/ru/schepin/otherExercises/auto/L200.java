package ru.schepin.otherExercises.auto;

public class L200 extends Auto{
    private final double petrolConsumptionOn100Km = 9;

    public L200() {

    }

    public L200(double km) {
        super(km);
    }

    public double getPriceOfTravel() {
        return getPriceOn100Km() * getKm() / 100;
    }

    private double getPriceOn100Km() {
        return petrolConsumptionOn100Km * petrolPrice;
    }

}
