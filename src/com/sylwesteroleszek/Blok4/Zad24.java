package com.sylwesteroleszek.Blok4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zad24 {
    public static void main(String[] args) {
        int[] tablicaIntow = {3, 56, 567, 89, 2, 12, 23, 145};

        System.out.println(getMax(tablicaIntow));
        System.out.println(getMin(tablicaIntow));

        for (int i : getMaxMinAndSum(tablicaIntow)) {
            System.out.println(i);
        }
    }

    public static int getMax (int[] tablica) {
        int wynik = 0;
        int length = tablica.length;

        Arrays.sort(tablica);

        wynik = tablica[length - 1];

        return wynik;
    }

    public static int getMin (int[] tablica) {
        int wynik = 0;
        int length = tablica.length;

        Arrays.sort(tablica);

        wynik = tablica[0];

        return wynik;
    }

    public static int[] getMaxMinAndSum (int[] tablica) {
        int [] wynik = new int[3];

        Arrays.sort(tablica);

        wynik[0] = tablica[tablica.length - 1];
        wynik[1] = tablica[0];
        wynik[2] = tablica[tablica.length - 1] + tablica[0];

        return wynik;
    }
}
