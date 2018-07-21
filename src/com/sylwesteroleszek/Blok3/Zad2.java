package com.sylwesteroleszek.Blok3;

public class Zad2 {
    public static void main(String[] args) {
        int granica = 25;
        int suma = 0;
        for (int i = 1; i <= granica; i++) {
            suma += (i * i);
        }
        System.out.println(suma);
    }

}
