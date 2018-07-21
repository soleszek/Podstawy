package com.sylwesteroleszek.Blok4;

public class Zad27 {
    public static void main(String[] args) {
        int[] tablica = {34, 12, 34, 12, 56, 67, 67};

        for(int z : getDistinct(tablica)) {
            System.out.println(z);
        }

    }

    public static int[] getDistinct (int[] tablica) {
        int end = tablica.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (tablica[i] == tablica[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        tablica[shiftLeft] = tablica[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] tablicaBezPowtorzen = new int[end];
        for(int i = 0; i < end; i++){
            tablicaBezPowtorzen[i] = tablica[i];
        }

        return tablicaBezPowtorzen;
    }
}
