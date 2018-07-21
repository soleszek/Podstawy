package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad6_3 {

    public static void main(String[] args) {
        String wyraz = "";
        Scanner skaner = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz wyraz, żeby sprawdzić czy jest palindromem: ");

            wyraz = skaner.nextLine();
            int dlugosc = wyraz.length();
            int k = dlugosc - 1;
            int sprawdzenie = 2;

            for (int i = 0; i < dlugosc; i++) {
                if (wyraz.charAt(i) == wyraz.charAt(k)) {
                    sprawdzenie = 1;
                } else {
                    sprawdzenie = 0;
                }
                k--;
            }
            if (sprawdzenie == 1) {
                System.out.println("Wyraz jest palindromem.");
            } else {
                System.out.println("Wyraz nie jest palindromem.");
            }
        }
    }
}
