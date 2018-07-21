package com.sylwesteroleszek.Blok4;

public class Zad12 {
    public static void main(String[] args) {
        int x = 5;
        int y = x;

        for (int i = 1; i <= x; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < y ; k++) {
                System.out.print("*");
            }
            y--;
            System.out.println();
        }
    }
}
