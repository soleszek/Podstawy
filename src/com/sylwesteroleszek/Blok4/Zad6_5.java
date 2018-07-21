package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad6_5 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String tekst = null;

        while (true) {
            System.out.println("Wpisz tekst do sprawdzenia lub q, żeby wyjść: ");
            tekst = skaner.nextLine();
            int dlugosc = tekst.length();
            int dlugosc2 = dlugosc - 1;

            int test = 2;

            if(tekst.equals("q")) {
                break;
            } else {
                for(int i = 0; i < dlugosc; i++) {
                    if (tekst.charAt(i) == tekst.charAt(dlugosc2)) {
                        test = 1;
                    } else {
                        test = 0;
                    }
                    dlugosc2--;
                }

                if (test == 1) {
                    System.out.println("Tekst jest palindromem");
                } else {
                    System.out.println("Tekst nie jest palindromem");
                }
            }
        }
    }
}
