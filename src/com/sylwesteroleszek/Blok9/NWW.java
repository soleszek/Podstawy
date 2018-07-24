package com.sylwesteroleszek.Blok9;

import java.util.Scanner;

public class NWW {
    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        x = sc.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        y = sc.nextInt();

        System.out.println("NWW liczb " + x + " i " + y + " wynosi: " + ((x * y) / nwd(x,y)));
    }
}
