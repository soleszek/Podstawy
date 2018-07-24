package com.sylwesteroleszek.Blok4;

public class Zad34_4 {
    public static void main(String[] args) {
        int liczba = 723;
        int[] nominaly = {200, 100, 50, 20, 10, 5, 2, 1};
        int suma = 0;

        while(suma < liczba) {
            for (int i = 0; i < nominaly.length; i++) {
                if (suma + nominaly[i] <= liczba) {
                    suma += nominaly[i];
                    System.out.println(nominaly[i]);
                    break;
                }
            }
        }
    }


}
