package com.sylwesteroleszek.Blok4;

public class Zad23 {
    public static void main(String[] args) {
        int[] tablicaIntow = {2, 4, 7, 12, 56};

        wypiszInty(tablicaIntow);
    }

    public static void wypiszInty (int[] tablica) {
        for (int i : tablica) {
            System.out.println(i);
        }
    }
}
