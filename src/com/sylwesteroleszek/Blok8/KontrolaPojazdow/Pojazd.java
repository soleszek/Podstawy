package com.sylwesteroleszek.Blok8.KontrolaPojazdow;

public class Pojazd {
    private double CO;
    private double HC;
    private double NOx;
    private double HCAndNOx;
    private double PM;

    public Pojazd() {};

    public Pojazd(double CO, double HC, double NOx, double HCAndNOx, double PM) {
        this.CO = CO;
        this.HC = HC;
        this.NOx = NOx;
        this.HCAndNOx = HCAndNOx;
        this.PM = PM;
    }

    public double getCO() {
        return CO;
    }

    public void setCO(double CO) {
        this.CO = CO;
    }

    public double getHC() {
        return HC;
    }

    public void setHC(double HC) {
        this.HC = HC;
    }

    public double getNOx() {
        return NOx;
    }

    public void setNOx(double NOx) {
        this.NOx = NOx;
    }

    public double getHCAndNOx() {
        return HCAndNOx;
    }

    public void setHCAndNOx(double HCAndNOx) {
        this.HCAndNOx = HCAndNOx;
    }

    public double getPM() {
        return PM;
    }

    public void setPM(double PM) {
        this.PM = PM;
    }
}
