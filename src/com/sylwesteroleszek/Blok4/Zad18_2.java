package com.sylwesteroleszek.Blok4;

public class Zad18_2 {
    public static void main(String[] args) {
        String litery = "aabbbccbb";

        char[] literyTablica = {'a', 'b', 'c'};

        int temp = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;

        for (int i = 0; i < litery.length(); i++) {
            if (litery.charAt(i) == literyTablica[0]) {
                temp++;
            } else {
                temp = 0;
            }

            if (temp > countA) {
                countA = temp;
            }
        }

        for (int i = 0; i < litery.length(); i++) {
            if (litery.charAt(i) == literyTablica[1]) {
                temp++;
            } else {
                temp = 0;
            }

            if (temp > countB) {
                countB = temp;
            }
        }

        for (int i = 0; i < litery.length(); i++) {
            if (litery.charAt(i) == literyTablica[2]) {
                temp++;
            } else {
                temp = 0;
            }

            if (temp > countC) {
                countC = temp;
            }
        }

        if (countA > countB && countA > countC) {
            System.out.println("Najdłuższy ciąg litery A wynosi: " + countA);
        } else if (countB > countA && countB > countC) {
            System.out.println("Najdłuższy ciąg litery B wynosi: " + countB);
        } else {
            System.out.println("Najdłuższy ciąg litery C wynosi: " + countC);
        }

    }
}
