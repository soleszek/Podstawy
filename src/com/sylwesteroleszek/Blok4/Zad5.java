package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        String wyraz = "alfabet";
        int dlugosc = wyraz.length();
        int ile = 0;

        for (int i = 0; i < dlugosc; i++) {
            if(wyraz.charAt(i) == 'a') {
                ile++;
            }
        }

        System.out.println("Litera a występuje " + ile + " razy.");
    }

}
