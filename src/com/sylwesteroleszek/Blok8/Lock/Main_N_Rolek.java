package com.sylwesteroleszek.Blok8.Lock;

import java.util.Scanner;

public class Main_N_Rolek {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Ustaw kod odblokowujący zamek:");
        String solverCode = skaner.nextLine();
        int[] solver = new int[solverCode.length()];
        for (int i = 0; i < solverCode.length(); i++) {
            char znak = solverCode.charAt(i);
            int digit = Integer.parseInt(String.valueOf(znak));
            solver[i] = digit;
        }

        LockNRolek lock = new LockNRolek(solver);

        boolean run = true;

        while (run) {
            System.out.println(" Co chcesz zrobić: 1-wypisz aktualny kod, 2-inkrementuj rolkę, 3-sprawdź zamek, 4-zamknij");
            int option = skaner.nextInt();

            switch (option) {
                case 1:
                    lock.printCurrentCode();
                    break;
                case 2:
                    System.out.println("Podaj numer rolki do zwiększenia, liczymy od 1, nie od 0");
                    int rolka = skaner.nextInt();
                    lock.increment(rolka - 1);
                    break;
                case 3:
                    lock.check();
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
    }
}
