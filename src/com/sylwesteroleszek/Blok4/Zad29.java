package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad29 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj długości dwóch boków prostokąta: ");
        int bok1 = skaner.nextInt();
        int bok2 = skaner.nextInt();

        poleProstokata(bok1, bok2);

    }

    public static void poleProstokata(int bok1, int bok2) {
        int pole = bok1 * bok2;
        System.out.println(pole);
    }
}
