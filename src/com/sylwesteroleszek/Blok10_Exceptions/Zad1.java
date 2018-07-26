package com.sylwesteroleszek.Blok10_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        int liczba = 0;
        try {
            while (true) {

                    System.out.println("Podaj liczbę: ");

                    liczba = skaner.nextInt();

                }
            }

        catch (InputMismatchException e) {
            System.out.println("Nie podałeś liczby!");
            System.out.println("Wpisz ponownie liczbę.");
        }
    }
}
