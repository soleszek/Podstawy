package com.sylwesteroleszek.Blok5;

public class Zad1 {
    public static void main(String[] args) {
        int[] inty = {3, 6, 8, 9, 11};

        metoda(inty);
    }

    public static void metoda(int[] inty) {
        for (int i : inty) {
            System.out.println(i);
        }
    }
}
