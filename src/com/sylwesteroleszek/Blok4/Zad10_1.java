package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad10_1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String wysokosc = "5";

            for (int i = 0; i < Integer.parseInt(wysokosc); i++) {
                for (int j = 0; j < 1 + i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
