package com.sylwesteroleszek.Blok4;

public class Zad22 {
    public static void main(String[] args) {
        String tekst = "konstantynopolitańczykówna";
        char znak = 'o';

        System.out.println(occuranceNumber(tekst, znak));
    }

    public static int occuranceNumber(String tekst, char znak) {
        int number = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                number++;
            }
        }

        return number;
    }
}
