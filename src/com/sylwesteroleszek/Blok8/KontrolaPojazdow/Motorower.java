package com.sylwesteroleszek.Blok8.KontrolaPojazdow;

public class Motorower extends Pojazd {

    private int iloscPrzerzutek;

    public Motorower() {
    };

    public Motorower(double CO, double HC, double NOx, double HCAndNOx, double PM, int iloscPrzerzutek) {
        super(CO, HC, NOx, HCAndNOx, PM);
        this.iloscPrzerzutek = iloscPrzerzutek;
    }

    public int getIloscPrzerzutek() {
        return iloscPrzerzutek;
    }

    public void setIloscPrzerzutek(int iloscPrzerzutek) {
        this.iloscPrzerzutek = iloscPrzerzutek;
    }
}
