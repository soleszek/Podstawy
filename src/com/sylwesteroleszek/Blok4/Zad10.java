package com.sylwesteroleszek.Blok4;

public class Zad10 {
    public static void main(String[] args) {
        int wysokosc = 5;

        for(int i = 0; i <= wysokosc; i++) {
            for (int j = 0; j <= wysokosc; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (1 + i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
