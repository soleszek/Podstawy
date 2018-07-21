package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad6_2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Wpisz tekst, żeby sprwawdzić czy jest palindromem: ");
        String tekst = skaner.nextLine();
        int dlugoscTekstu = tekst.length();
        int k = dlugoscTekstu - 1;
        int kk = 2;

        for (int i = 0; i < dlugoscTekstu; i++) {
            if (tekst.charAt(i) == tekst.charAt(k)) {
                kk = 1;
            } else {
                kk = 0;
            }
            k--;
        }

        if (kk == 1) {
            System.out.println("Wyraz jest palindromem.");
        } else {
            System.out.println("Wyraz nie jest palindromem.");
        }

    }
}
