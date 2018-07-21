package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj wysokość choinki: ");
        int h = skaner.nextInt();

        for (int i = 0; i <= h ; i++) {
            for(int j = 0; j < (h - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (1 + (2*i)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
