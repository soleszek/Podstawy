package com.sylwesteroleszek.ZadanieGrupowe;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz cyfrę, aby wybrać rodzaj działania: 1 - dodaj, 2 - odejmij, 3 - pomnóż, 4 - podziel, 5 - podziel modulo, 6 - wyjdź");

            byte wybor = skaner.nextByte();

            if (wybor == 6) {
                break;
            } else if (wybor != 1 && wybor != 2 && wybor != 3 && wybor != 4 && wybor != 5) {
                System.out.println("Dokonaj właściwego wyboru");
            } else
            {
                System.out.println("Wpisz dwie liczby: ");
                int liczba1 = skaner.nextInt();
                int liczba2 = skaner.nextInt();
                int wynik;

                switch (wybor) {
                    case 1:
                        System.out.println(wynik = liczba1 + liczba2);
                        break;
                    case 2:
                        System.out.println(wynik = liczba1 - liczba2);
                        break;
                    case 3:
                        System.out.println(wynik = liczba1 * liczba2);
                        break;
                    case 4:
                        if (liczba2 == 0) {
                            System.out.println("Nie dziel przez zero");
                        } else {
                            System.out.println(wynik = liczba1 / liczba2);
                        }
                        break;
                    case 5:
                        System.out.println(wynik = liczba1 % liczba2);
                        break;
                }
            }
        }
    }
}
