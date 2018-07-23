package com.sylwesteroleszek.Blok8.KontrolaPojazdow;

public class Main {

    public static void main(String[] args) {
        Dostawczak dostawczak = new Dostawczak(0.2, 0.3, 0.4, 0.5, 0.6, 150);
        Motocykl motocykl = new Motocykl(0.6, 0.5, 0.4, 0.3, 0.3, 2);
        Motorower motorower = new Motorower(0.1, 0.1, 0.2, 0.2, 0.3, 18);
        Samochod samochod = new Samochod(0.2, 0.3, 0.4, 0.5, 0.6, 3,  0.25);
        Mikrobus mikrobus = new Mikrobus(0.1, 0.1, 0.2, 0.2, 0.3, 15, 150);

        System.out.println("Kontrola dostawczaka");
        sprawdzSpaliny(dostawczak);

        System.out.println("Kontrola motocykla");
        sprawdzSpaliny(motocykl);

        System.out.println("Kontrola motorowera");
        sprawdzSpaliny(motorower);

        System.out.println("Kontrola samochodu");
        sprawdzSpaliny(samochod);

        System.out.println("Kontrola mikrobus");
        sprawdzSpaliny(mikrobus);
    }

    static void sprawdzSpaliny(Pojazd pojazd) {
        if (pojazd.getCO() > 1.0) {
            System.out.println("Za duża zawartość CO w spalinach");
        }

        if(pojazd.getHC() > 0.1) {
            System.out.println("Za duża zawartość HC w spalinach");
        }

        if(pojazd.getNOx() > 0.6) {
            System.out.println("Za duża zawartość NOx w spalinach");
        }

        if(pojazd.getHCAndNOx() > 0.5) {
            System.out.println("Za duża zawartość HCAndNOx w spalinach");
        }

        if (pojazd.getPM() > 0.005) {
            System.out.println("Za duża zawartość PM w spalinach");
        }
    }

}
