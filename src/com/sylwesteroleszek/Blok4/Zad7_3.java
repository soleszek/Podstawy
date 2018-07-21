package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad7_3 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int wysokosc = 0;
        while (true) {
            System.out.println("Podaj wysokosc choinki: ");
            wysokosc = skaner.nextInt();

            for (int i = 0; i < wysokosc; i++) {
                for (int j = 0; j < wysokosc - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (1 + 2*i); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
