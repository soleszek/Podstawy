package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad6_4 {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String tekst = null;

        while (true) {
            System.out.println("Wpisz wyraz, żeby sprawdzić: ");
            tekst = skaner.nextLine();
            int dlugosc = tekst.length();

            int test = 2;
            int dlugosc2 = dlugosc - 1;

            for (int i = 0; i < dlugosc; i++) {

                if (tekst.charAt(i) == tekst.charAt(dlugosc2)) {
                    test = 1;
                } else {
                    test = 0;
                }
                dlugosc2--;
            }
            if (test == 1) {
                System.out.println("Wyraz jest palindromem");
            } else {
                System.out.println("Wyraz nie jest palindromem");
            }
        }

    }

}
