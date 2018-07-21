package com.sylwesteroleszek.Blok4;

public class Zad25 {
    public static void main(String[] args) {
        int[] tablica1 = {34, 67, 12, 1, 56};
        int[] tablica2 = {11, 12, 90, 3};

        for (int k : getLarger(tablica1, tablica2)) {
            System.out.println(k);
        }
    }

    public static int[] getLarger(int[] tablica1, int[] tablica2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i : tablica1) {
            sum1 += i;
        }

        for (int j : tablica2) {
            sum2 += j;
        }

        if (sum1 > sum2) {
            return tablica1;
        } else {
            return tablica2;
        }
    }
}
