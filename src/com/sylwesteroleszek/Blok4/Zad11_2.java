package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad11_2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int h = 5;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
