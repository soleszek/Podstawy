package com.sylwesteroleszek.Blok1;

public class Zad6 {
    public static void main(String[] args) {
        char znak = ' ';

     if (Character.isAlphabetic(znak)) {
         System.out.println("Znak jest literą");
     } else if (Character.isDigit(znak)) {
         System.out.println("Znak jest liczbą");
     } else if (znak == ' '){
         System.out.println("Znak jest spacją");
     }

    }
}
