package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String wynik = "";

        while (true) {
            String lancuch = skaner.nextLine();

            if (lancuch.equals("exit")) {
                break;
            } else {
                wynik += lancuch;
                System.out.println(wynik);
            }
        }
    }
}
