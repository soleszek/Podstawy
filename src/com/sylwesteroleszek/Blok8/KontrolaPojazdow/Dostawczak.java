package com.sylwesteroleszek.Blok8.KontrolaPojazdow;

public class Dostawczak extends Pojazd{

    private int pojemnoscPaki;

    public Dostawczak(double CO, double HC, double NOx, double HCAndNOx, double PM, int pojemnoscPaki) {
        super(CO, HC, NOx, HCAndNOx, PM);
        this.pojemnoscPaki = pojemnoscPaki;
    }

    public int getPojemnoscPaki() {
        return pojemnoscPaki;
    }

    public void setPojemnoscPaki(int pojemnoscPaki) {
        this.pojemnoscPaki = pojemnoscPaki;
    }

    @Override
    public String toString() {
        return "Dostawczak{" +
                "pojemnoscPaki=" + pojemnoscPaki +
                '}';
    }
}
