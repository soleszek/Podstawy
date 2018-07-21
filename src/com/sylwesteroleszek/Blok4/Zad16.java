package com.sylwesteroleszek.Blok4;

import java.util.Arrays;

public class Zad16 {
    public static void main(String[] args) {
        String alfabet = "alfabet";
        int dlugosc = alfabet.length();
        char[] chary = new char[dlugosc];

        int k = dlugosc - 1;

        for (int i = 0; i < dlugosc; i++) {
            chary[i] = alfabet.charAt(i);
        }
        Arrays.sort(chary);

        System.out.println(chary[0]);

    }
}
