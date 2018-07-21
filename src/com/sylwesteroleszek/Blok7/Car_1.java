package com.sylwesteroleszek.Blok7;

public class Car_1 extends Vehicle_1 {
    private int pojemnoscSilnika;
    private int liczbaDrzwi;

    public Car_1(int speed, int maxSpeed, int wheelCount, int pojemnoscSilnika, int liczbaDrzwi) {
        super(speed, maxSpeed, 4);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public String toString() {
        return super.toString() + ", pojemność silnika wynosi: " + pojemnoscSilnika + ", liczba drzwi wynosi: " + liczbaDrzwi;
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
