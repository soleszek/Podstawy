package com.sylwesteroleszek.Blok2;

public class Zad6 {
    public static void main(String[] args) {
        int parametr1 = 35;
        int parametr2 = 3;

        System.out.println("Wynik odejmowania to: " + subtract(parametr1, parametr2));
    }

    public static int subtract (int parametr1, int parametr2) {
        int wynik = parametr1 - parametr2;
        return wynik;
    }
}
