package com.sylwesteroleszek.Blok5;

public class Zad7_1 {
    public static void main(String[] args) {
        int[] tablica = {12, 45, 67, 11, 23, 100};
        int dlugoscTablicy = tablica.length;
        int rozmiar = dlugoscTablicy - 1;

        int[] odwroconaTablica = new int[dlugoscTablicy];

        for (int i = 0; i < dlugoscTablicy; i++) {
            odwroconaTablica[rozmiar] = tablica[i];
            rozmiar--;
        }

        System.out.println("Odwrócona tablica intów to: ");

        for (int j : odwroconaTablica) {
            System.out.println(j);
        }

    }
}
