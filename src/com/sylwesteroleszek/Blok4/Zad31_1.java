package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad31_1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int liczba = 0;


        while (true) {
            System.out.println("Podaj liczbę, żeby sprawdzić czy jest pierwsza :");
            boolean czyPierwsza = true;
            liczba = skaner.nextInt();
            int temp = 0;

            for (int i = 2; i <= liczba / 2; i++) {
                temp = liczba % i;
                if (temp == 0) {
                    czyPierwsza = false;
                    break;
                }
            }
            if (czyPierwsza) {
                System.out.println("Liczba jest pierwsza");
            } else {
                System.out.println("Liczba nie jest pierwsza");
            }
        }

    }
}
