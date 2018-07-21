package com.sylwesteroleszek.Blok1;

public class Zad1 {
    public static void main(String[] args) {
        byte zmienna1 = 26;
        byte zmienna2 = 27;
        byte zmienna3 = 25;

        if (zmienna1 > zmienna2 && zmienna1 > zmienna3) {
            System.out.println(zmienna1);
        } else if (zmienna2 > zmienna1 && zmienna2 > zmienna3) {
            System.out.println(zmienna2);
        } else {
            System.out.println(zmienna3);
        }
    }
}
