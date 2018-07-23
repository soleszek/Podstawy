package com.sylwesteroleszek.Blok8.KontrolaPojazdow;

public class Motocykl extends Pojazd {

    private int gruboscLancucha;

    public Motocykl() {
    };

    public Motocykl(double CO, double HC, double NOx, double HCAndNOx, double PM, int gruboscLancucha) {
        super(CO, HC, NOx, HCAndNOx, PM);
        this.gruboscLancucha = gruboscLancucha;
    }

    public int getGruboscLancucha() {
        return gruboscLancucha;
    }

    public void setGruboscLancucha(int gruboscLancucha) {
        this.gruboscLancucha = gruboscLancucha;
    }
}
