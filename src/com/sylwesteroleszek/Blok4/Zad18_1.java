package com.sylwesteroleszek.Blok4;

public class Zad18_1 {
    public static void main(String[] args) {
        String tekst = "aabbbccbb";

        int countA = 0;
        int countB = 0;
        int countC = 0;

        int tempCount = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == 'a') {
                tempCount++;
            } else {
                tempCount = 0;
            }

            if (tempCount > countA) {
                countA = tempCount;
            }
        }

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == 'b') {
                tempCount++;
            } else {
                tempCount = 0;
            }

            if (tempCount > countB) {
                countB = tempCount;
            }
        }

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == 'c') {
                tempCount++;
            } else {
                tempCount = 0;
            }

            if (tempCount > countC) {
                countC = tempCount;
            }
        }


        if (countA > countB && countA > countC) {
            System.out.println("Liczba wystąpień litery A: " + countA);
        } else if (countB > countA && countB > countC) {
            System.out.println("Liczba wystąpień litery B: " + countB);
        } else {
            System.out.println("Liczba wystąpień litery C: " + countC);
        }
    }
}
