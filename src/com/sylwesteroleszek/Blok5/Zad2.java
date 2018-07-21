package com.sylwesteroleszek.Blok5;

public class Zad2 {
    public static void main(String[] args) {
        int[] inty = {34, 12, 90, 11, 23};

        System.out.println(getSum(inty));
    }

    public static int getSum (int[] inty) {
        int suma = 0;

        for (int i : inty) {
            suma += i;
        }

        return suma;
    }
}
