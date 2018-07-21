package com.sylwesteroleszek.Blok2;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner mojSkaner = new Scanner(System.in);
        short liczba1;
        short liczba2;

        while (true) {
            System.out.println("Wpisz dwie liczby: ");
            liczba1 = mojSkaner.nextShort();
            liczba2 = mojSkaner.nextShort();
            for (short i = liczba1; i <=liczba2; i++) {
                System.out.println(i);
            }
        }
    }
}
