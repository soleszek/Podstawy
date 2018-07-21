package com.sylwesteroleszek.Blok4;

public class Zad21 {
    public static void main(String[] args) {

        double base = 3;
        double powerIndex = 3;
        System.out.println(power(base, powerIndex));
    }

    public static double power (double base, double powerIndex) {
        double wynik = 0;

        wynik = Math.pow(base, powerIndex);

        return wynik;
    }
}
