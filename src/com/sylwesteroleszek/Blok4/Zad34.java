package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad34 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        int[] bills = {200, 100, 50, 20, 10, 5, 2, 1};

        int sum = 0;

        while (true) {
            System.out.println("Podaj liczbę, żeby sprawdzić: ");
            int number = skaner.nextInt();

            while (sum < number) {
                for (int i = 0; i < bills.length; i++) {
                    if (sum + bills[i] <= number) {
                        sum += bills[i];

                        System.out.println(bills[i] + ", ");
                        break;
                    }
                }
            }


        }
    }
}
