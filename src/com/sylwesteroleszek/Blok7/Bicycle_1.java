package com.sylwesteroleszek.Blok7;

public class Bicycle_1 extends Vehicle_1 {
    private int rozmiarKol;
    private int liczbaPrzerzutek;

    public Bicycle_1(int speed, int maxSpeed, int wheelCount, int rozmiarKol, int liczbaPrzerzutek) {
        super(speed, maxSpeed, 2);
        this.rozmiarKol = rozmiarKol;
        this.liczbaPrzerzutek = liczbaPrzerzutek;
    }

    public String toString() {
        return super.toString() + ", rozmiar kół wynosi: " + rozmiarKol + ", liczba przerzutek: " + liczbaPrzerzutek;
    }

    public int getRozmiarKol() {
        return rozmiarKol;
    }

    public void setRozmiarKol(int rozmiarKol) {
        this.rozmiarKol = rozmiarKol;
    }

    public int getLiczbaPrzerzutek() {
        return liczbaPrzerzutek;
    }

    public void setLiczbaPrzerzutek(int liczbaPrzerzutek) {
        this.liczbaPrzerzutek = liczbaPrzerzutek;
    }
}
