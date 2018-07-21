package com.sylwesteroleszek.Blok5;

public class Zad3 {

    public static void main(String[] args) {
        int[] tablica1 = {12, 34, 56, 67, 100};
        int[] tablica2 = {34, 11, 2, 45, 90};

        System.out.println(getLarger(tablica1, tablica2));
    }

    public static int[] getLarger(int[] tablica1, int[] tablica2) {

        int suma1 = 0;
        int suma2 = 0;

        for(int i : tablica1) {
            suma1 += i;
        }

        for (int j : tablica2) {
            suma2 += j;
        }

        if (suma1 > suma2) {
            System.out.println("Wieksza jest tablica1.");
            return tablica1;
        } else {
            System.out.println("Wieksza jest tablica2");
            return tablica2;
        }
    }

}
