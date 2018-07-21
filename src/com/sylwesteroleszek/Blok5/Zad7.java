package com.sylwesteroleszek.Blok5;

public class Zad7 {
    public static void main(String[] args) {
        int[] inty = {45, 12, 45, 67, 1};

        reverse(inty);
    }

    public static void reverse (int[] inty) {
        int dlugosc = inty.length;
        int[] odwroconeInty = new int[dlugosc];
        int k = 4;

        for (int i = 0; i < dlugosc; i++) {
            odwroconeInty[i] = inty[k];
            k--;
        }

        for (int j : odwroconeInty) {
            System.out.println(j);
        }
    }
}
