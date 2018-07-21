package com.sylwesteroleszek.Blok7;

public class Car extends Vehicle {
    private int pojemnoscSilnika;
    private int liczbaDrzwi;

    public Car(int speed, int maxSpeed, int wheelCount, int pojemnoscSilnika, int liczbaDrzwi) {
        super(speed, maxSpeed, 4);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public String toString() {
        return super.toString() + " Pojemność silnika wynosi: " + pojemnoscSilnika + " liczba drzwi wynosi: " + liczbaDrzwi;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }
}
