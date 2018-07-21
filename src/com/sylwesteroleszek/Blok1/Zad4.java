package com.sylwesteroleszek.Blok1;

public class Zad4 {
    public static void main(String[] args) {
        byte zmienna1 = 5;
        byte zmienna2 = 6;
        byte zmienna3 = 7;

        if(zmienna1 > zmienna2 && zmienna1 > zmienna3) {
            System.out.println("Zmienna 1 jest największa");
        } else if (zmienna2 > zmienna1 && zmienna2 > zmienna3) {
            System.out.println("Zmienna 2 jest największa");
        } else {
            System.out.println("Zmienna 3 jest największa");
        }
    }
}
