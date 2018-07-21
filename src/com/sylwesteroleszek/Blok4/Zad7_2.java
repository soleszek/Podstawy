package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad7_2 {
    public static void main(String[] args) {
        System.out.println("Podaj wysokość choinki: ");
        Scanner skaner = new Scanner(System.in);
        int h = skaner.nextInt();

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < (h - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (1 + 2*i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
