package com.sylwesteroleszek.Blok4;

public class Zad11 {
    public static void main(String[] args) {
        int x = 4;
        int y = x;

        for (int i = 0; i < x; i++) {

            for (int k = y; k > 0; k-- ) {
                System.out.print("*");
            }

            for (int j = 0; j < (1 + i); j++) {
                System.out.print(" ");
            }
            y--;
            System.out.println();
        }
    }
}
