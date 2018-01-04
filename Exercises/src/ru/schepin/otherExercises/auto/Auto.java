package ru.schepin.otherExercises.auto;

public class Auto {
    final double petrolPrice = 40;
    final double DiselPrice = 39.30;

    private double petrolConsumptionOn100Km;
    private double km;

    public Auto( double km) {
        this.km = km;
    }

    public Auto() {
    }

    public double getPetrolPrice() {
        return petrolPrice;
    }

    public double getPetrolConsumption() {
        return petrolConsumptionOn100Km;
    }

    public double getKm() {
        return km;
    }

    public void setPetrolConsumptionOn100Km(double petrolConsumptionOn100Km) {
        this.petrolConsumptionOn100Km = petrolConsumptionOn100Km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
