package com.sylwesteroleszek.Blok1;

public class Zad3 {
    public static void main(String[] args) {
        byte liczba = 13;

        if(liczba % 5 == 0 || liczba % 8 == 0) {
            System.out.println("Liczba jest podzielna przez 5 lub przez 8");
        } else {
            System.out.println("Liczba nie jest podzielna przez 5 lub przez 8");
        }
    }
}
