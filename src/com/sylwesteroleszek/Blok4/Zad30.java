package com.sylwesteroleszek.Blok4;

import java.util.Scanner;

public class Zad30 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz figurę, której pole chcesz policzyć: 1 - kwadrat, 2 - prostokąt, 3 - koło, 4 - trójkąt");

            String wybor = skaner.next();

            switch (wybor) {
                case "1":
                    System.out.println("Podaj długość boku: ");
                    int bok = skaner.nextInt();
                    int pole = bok * bok;
                    System.out.println("Pole kwadratu wynosi: " + pole);
                    break;
                case "2":
                    System.out.println("Podaj długości boków a i b: ");
                    int bok1 = skaner.nextInt();
                    int bok2 = skaner.nextInt();
                    int poleProstokata = bok1 * bok2;
                    System.out.println("Pole prostokąta wynosi: " + poleProstokata);
                    break;
                case "3":
                    System.out.println("Podaj wartość promienia: ");
                    float promien = skaner.nextFloat();
                    float poleKola = 3.14f * promien;
                    System.out.println("Pole koła wynosi: " + poleKola);
                    break;
                case "4":
                    System.out.println("Podaj wartości boku a oraz wysokości: ");
                    float bokA = skaner.nextFloat();
                    float h = skaner.nextFloat();
                    float poleTrojkata = 0.5f * bokA * h;
                    System.out.println("Pole trójkąta wynosi: " + poleTrojkata);
                    break;
                default:
                    System.out.println("Niewłaściwy wybór.");
                    break;
            }
        }
    }
}

