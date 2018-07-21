package com.sylwesteroleszek.Blok2;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner mojSkaner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz proszę dwie liczby: ");
            int parametr1 = mojSkaner.nextInt();
            int parametr2 = mojSkaner.nextInt();

            System.out.println("Wynik mnożenia to: " + multiply(parametr1, parametr2));
        }
    }

    public static int multiply(int parametr1, int parametr2) {
        int wynik = parametr1 * parametr2;
        return wynik;
    }
}
