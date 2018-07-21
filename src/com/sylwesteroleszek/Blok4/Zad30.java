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
                    int obwod = 4 * bok;
                    System.out.println("Pole kwadratu wynosi: " + pole + ", obwód: " + obwod);
                    break;
                case "2":
                    System.out.println("Podaj długości boków a i b: ");
                    int bok1 = skaner.nextInt();
                    int bok2 = skaner.nextInt();
                    int poleProstokata = bok1 * bok2;
                    int obwodProstokata = (2 * bok1) + (2 * bok2);
                    System.out.println("Pole prostokąta wynosi: " + poleProstokata + ", obwód: " + obwodProstokata);
                    break;
                case "3":
                    System.out.println("Podaj wartość promienia: ");
                    float promien = skaner.nextFloat();
                    float poleKola = 3.14f * promien;
                    float obwodKola = 2 * 3.14f * promien;
                    System.out.println("Pole koła wynosi: " + poleKola + " obwod: " + obwodKola);
                    break;
                case "4":
                    System.out.println("Podaj wartości boków a, b, c oraz wysokości h: ");
                    float bokA = skaner.nextFloat();
                    float bokB = skaner.nextFloat();
                    float bokC = skaner.nextFloat();
                    float h = Float.parseFloat(skaner.next());
                    float poleTrojkata = 0.5f * bokA * h;
                    float obwodTrojkata = bokA + bokB + bokC;
                    System.out.println("Pole trójkąta wynosi: " + poleTrojkata + ", obwód: " + obwodTrojkata);
                    break;
                default:
                    System.out.println("Niewłaściwy wybór.");
                    break;
            }
        }
    }
}

