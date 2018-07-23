package com.sylwesteroleszek.Blok8.KontrolaPojazdow;

public class Samochod extends Pojazd {

    private double wysokoscSpojlera;
    private double wspolczynnikPrzyciemnianiaSzyb;

    public Samochod() {
    };

    public Samochod(double CO, double HC, double NOx, double HCAndNOx, double PM, double wysokoscSpojlera, double wspolczynnikPrzyciemnianiaSzyb) {
        super(CO, HC, NOx, HCAndNOx, PM);
        this.wysokoscSpojlera = wysokoscSpojlera;
        this.wspolczynnikPrzyciemnianiaSzyb = wspolczynnikPrzyciemnianiaSzyb;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getWysokoscSpojlera() {
        return wysokoscSpojlera;
    }

    public void setWysokoscSpojlera(double wysokoscSpojlera) {
        this.wysokoscSpojlera = wysokoscSpojlera;
    }

    public double getWspolczynnikPrzyciemnianiaSzyb() {
        return wspolczynnikPrzyciemnianiaSzyb;
    }

    public void setWspolczynnikPrzyciemnianiaSzyb(double wspolczynnikPrzyciemnianiaSzyb) {
        this.wspolczynnikPrzyciemnianiaSzyb = wspolczynnikPrzyciemnianiaSzyb;
    }
}
