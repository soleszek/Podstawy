package com.sylwesteroleszek.Blok4;

public class Zad20 {
    public static void main(String[] args) {
        int parametr1 = 4;
        int parametr2 = 4;

        System.out.println(multiply(parametr1, parametr2));

        System.out.println(multiply2(parametr1, parametr2));

    }

    public static int multiply (int parametr1, int parametr2) {
        int wynik = 0;

        wynik = parametr1 * parametr2;

        return wynik;
    }

    public static int multiply2 (int parametr1, int parametr2) {
        int wynik = 0;

        for (int i = 1; i <= parametr1; i++) {
            for(int j = 1; j <= parametr2; j++) {
                wynik += 1;
            }
        }

        return wynik;
    }
}
