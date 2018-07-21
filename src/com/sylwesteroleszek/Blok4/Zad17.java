package com.sylwesteroleszek.Blok4;

public class Zad17 {
    public static void main(String[] args) {
        String alfabet = "alfabet";
        int wystapienia = 0;

        int dlugosc = alfabet.length();
        char[] alfabetTablica = new char[dlugosc];

        for (int i = 0; i < dlugosc; i++) {

            alfabetTablica[i] = alfabet.charAt(i);
        }

        for (char a : alfabetTablica) {
            if(a == 'a') {
                wystapienia++;
            }
        }

        System.out.println(wystapienia);
    }
}
