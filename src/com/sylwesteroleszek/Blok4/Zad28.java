package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad28 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = skaner.nextInt();

        for (int i = 0; i <= liczba; i++) {
            System.out.println(i);
        }
    }
}
