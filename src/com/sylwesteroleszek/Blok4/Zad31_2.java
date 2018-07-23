package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad31_2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int liczba = 0;
        boolean czyPierwsza = true;

        while (true) {
            System.out.println("Podaj liczbę, żeby sprawdzić czy jest pierwsza: ");
            liczba = skaner.nextInt();

            for (int i = 2; i <= liczba / 2; i++) {

                if (liczba % i == 0) {
                    czyPierwsza = false;
                    break;
                }

                czyPierwsza = true;
            }

            if (czyPierwsza) {
                System.out.println("Liczba " + liczba + " jest pierwsza.");
            } else {
                System.out.println("Liczba " + liczba + " nie jest pierwsza.");
            }

        }
    }
}
