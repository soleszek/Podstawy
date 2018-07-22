package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad33 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        double wynik = 0;

        while (true) {
            System.out.println("Podaj jakąś liczbę: ");

            double liczba = skaner.nextInt();
            double i = 1;
            final double TRZY = 3;

            while (true) {
                wynik = Math.pow(TRZY, i);
                if (wynik > liczba) {
                    System.out.println(i + " potęga liczby jest większa od podanej liczby " + liczba);
                    break;
                } else {
                    i++;
                }
            }



        }
    }
}
