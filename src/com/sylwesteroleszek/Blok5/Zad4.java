package com.sylwesteroleszek.Blok5;

public class Zad4 {
    public static void main(String[] args) {
        int[] tablica1 = {11, 23, 45, 1, 3};
        int[] tablica2 = {12, 24, 46, 2};

        for (int l : merge(tablica1, tablica2)) {
            System.out.println(l);
        }
    }

    public static int[] merge(int[] tablica1, int[] tablica2) {
        int dlugosc1 = tablica1.length;
        int dlugosc2 = tablica2.length;

        int calaDlugosc = dlugosc1 + dlugosc2;

        int[] tablicaSuma = new int[calaDlugosc];

        for (int i = 0; i < dlugosc1; i++) {
            tablicaSuma[i] = tablica1[i];
        }

        int k = 0;

        for (int j = dlugosc1; j < calaDlugosc; j++) {
            tablicaSuma[j] = tablica2[k];
            k++;
        }
        return tablicaSuma;
    }

}
