package com.sylwesteroleszek.Blok4;

public class Zad6 {
    public static void main(String[] args) {
        String tekst = "obbo";
        int dlugosc = tekst.length();
        int k = dlugosc - 1;

        int kk = 2;

        for (int i = 0; i < dlugosc; i++) {
            if (tekst.charAt(i) == tekst.charAt(k)) {
                kk = 1;
            } else {
                kk = 0;
            }
            k--;
        }

        if (kk == 1) {
            System.out.println("Tekst jest palindromem");
        } else {
            System.out.println("Tekst nie jest palindromem");
        }
    }
}
