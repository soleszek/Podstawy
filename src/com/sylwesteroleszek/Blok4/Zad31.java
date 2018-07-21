package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad31 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        boolean sprawdzenie = false;
        while (true) {
            System.out.println("Podaj liczbę, żeby sprawdzić czy jest pierwsza: ");

            int liczba = skaner.nextInt();

            for (int i = 2; i < liczba; i++) {
                if (((liczba / i) % 1) != 1) {
                    sprawdzenie = true;
                } else {
                    sprawdzenie = false;
                }
            }

            if (sprawdzenie) {
                System.out.println("Liczba nie jest pierwsza.");
            } else {
                System.out.println("Liczba jest pierwsza.");
            }
        }
    }
}
