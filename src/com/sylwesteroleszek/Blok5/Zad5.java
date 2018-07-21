package com.sylwesteroleszek.Blok5;

import java.util.Arrays;

public class Zad5 {
    public static void main(String[] args) {
        int[] tablica = {11, 14, 45, 56, 11, 1};

        Arrays.sort(tablica);

        for (int i : tablica) {
            System.out.println(i);
        }
    }
}
