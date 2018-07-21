package com.sylwesteroleszek.Blok4;

public class Zad26 {
    public static void main(String[] args) {
        int[] tablica1 = {23, 45, 12, 1, 90, 2};
        int[] tablica2 = {11, 12, 13, 45, 23};

        for (int l : merge(tablica1, tablica2)) {
            System.out.println(l);
        }
    }

    public static int[] merge (int[] tablica1, int[] tablica2) {
        int k = 0;

        int dlugosc1 = tablica1.length;
        int dlugosc2 = tablica2.length;

        int[] tablica3 = new int[dlugosc1 + dlugosc2];

        for (int i = 0; i < dlugosc1; i++) {
            tablica3[i] = tablica1[i];
        }

        for (int j = dlugosc1; j < (dlugosc1 + dlugosc2); j++ ) {
            tablica3[j] = tablica2[k];
            k++;
        }

        return tablica3;
    }
}
