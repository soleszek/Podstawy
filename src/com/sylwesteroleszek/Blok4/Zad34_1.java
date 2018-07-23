package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad34_1 {
    public static void main(String[] args) {
        int[] bills = {200, 100, 50, 20, 10, 5, 2, 1};

        int sum = 0;

        Scanner skaner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj liczbę, żeby sprawdzić: ");

            int liczba = skaner.nextInt();

            while (sum < liczba) {
                for (int i = 0; i < bills.length; i++) {
                    if (sum + bills[i] <= liczba) {
                        sum += bills[i];
                        System.out.println(bills[i] + ", ");
                        break;
                    }
                }

            }
        }

    }
}
