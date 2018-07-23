package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad34_2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int liczba = 0;
        int[] bills = {200, 100, 50, 20, 10, 5, 2, 1};
        int temp = 0;

        while (true) {
            System.out.println("Podaj kwotę, żeby rozłożyć ją na dostępe nominały: ");
            liczba = skaner.nextInt();
            while (temp < liczba)
                for (int i = 0; i < bills.length; i++) {
                    if (temp + bills[i] <= liczba) {
                        temp += bills[i];
                        System.out.println(bills[i]);
                        break;
                    }
                }
        }
    }

}

