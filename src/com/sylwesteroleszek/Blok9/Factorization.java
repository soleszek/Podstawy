package com.sylwesteroleszek.Blok9;

public class Factorization {
    public static void main(String[] args) {
        long number = 522;
        getPrimeFactors(number);
    }

    public static void getPrimeFactors(long number) {
        System.out.println("Factor: 1");
        for (long i = 2; i <= number / 2; i++) {
            while (number % i == 0) {
                number /= i;
                System.out.println("Factor: " + i);
            }
        }
        if (number > 1) {
            System.out.println("Factor: " + number);
        }
        System.out.println();
    }
}
