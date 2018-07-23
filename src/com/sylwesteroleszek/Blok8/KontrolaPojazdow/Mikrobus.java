package com.sylwesteroleszek.Blok8.KontrolaPojazdow;

public class Mikrobus extends Pojazd {

    private int iloscPasazerow;
    private int szerokoscPrzejscia;

    public Mikrobus() {
    };

    public Mikrobus(double CO, double HC, double NOx, double HCAndNOx, double PM, int iloscPasazerow, int szerokoscPrzejscia) {
        super(CO, HC, NOx, HCAndNOx, PM);
        this.iloscPasazerow = iloscPasazerow;
        this.szerokoscPrzejscia = szerokoscPrzejscia;
    }

    public int getIloscPasazerow() {
        return iloscPasazerow;
    }

    public void setIloscPasazerow(int iloscPasazerow) {
        this.iloscPasazerow = iloscPasazerow;
    }

    public int getSzerokoscPrzejscia() {
        return szerokoscPrzejscia;
    }

    public void setSzerokoscPrzejscia(int szerokoscPrzejscia) {
        this.szerokoscPrzejscia = szerokoscPrzejscia;
    }
}
