package com.sylwesteroleszek.Blok4;

public class Zad18 {
    public static void main(String[] args) {
        String tekst = "aabbbccbb";
        int dlugosc = tekst.length();
        int tempLength = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        boolean znalazlem = false;

        for (int i = 0; i < dlugosc; i++) {
            if (tekst.charAt(i) == 'a') {
                tempLength++;
            } else {
                tempLength = 0;
            }

            if (tempLength > a) {
                a = tempLength;
            }

        }

        for (int j = 0; j < dlugosc; j++) {
            if (tekst.charAt(j) == 'b') {
                tempLength++;
            } else {
                tempLength = 0;
            }

            if (tempLength > b) {
                b = tempLength;
            }

        }

        for (int k = 0; k < dlugosc; k++) {
            if (tekst.charAt(k) == 'c') {
                tempLength++;
            } else {
                tempLength = 0;
            }

            if (tempLength > c) {
                c = tempLength;
            }

        }


        if (a > b && a > c) {
            System.out.println("Najdłuższy jest ciąg litery a i wynosi: " + a);
        } else if (b > a && b > c) {
            System.out.println("Najdłuższy jest ciąg litery b i wynosi: " + b);
        } else {
            System.out.println("Najdłuższy jest ciąg litery c i wynosi: " + c);
        }

    }
}
