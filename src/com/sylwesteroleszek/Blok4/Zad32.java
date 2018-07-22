package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad32 {
    public static void main(String[] args) {
        String tak = "tak";
        Scanner skaner = new Scanner(System.in);

        while (true) {
            System.out.println("Czy chcesz zakończyć działanie programu?");

            tak = skaner.next();

            if (tak.equals("tak")) {
                break;
            }
        }
    }
}
