package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad7_5 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String wysokosc = null;

        while (true) {
            System.out.println("Podaj wysokosc choinki lub q, żeby wyjść: ");
            wysokosc = skaner.nextLine();

            if (wysokosc.equals("q")) {
                break;
            } else {
                for (int i = 0; i < Integer.parseInt(wysokosc); i++) {
                    for (int j = 0; j < Integer.parseInt(wysokosc) - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < (1 + 2 * i); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
