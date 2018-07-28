package Stos_i_kolejka;

import java.util.Scanner;
import java.util.Stack;

public class Zad1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Wpisz wyraz, żeby sprawdzić, czy jest palindromem: ");
            Scanner skaner = new Scanner(System.in);
            String wyraz = skaner.nextLine();
            String nowyWyraz = "";
            //skaner.close();

            Stack<Character> stos = new Stack();

            for (int i = 0; i < wyraz.length(); i++) {
                stos.push(wyraz.charAt(i));
            }

            for (int j = 0; j < wyraz.length(); j++) {
                nowyWyraz += stos.pop();
                //System.out.println(stos.pop());
            }
            System.out.println(nowyWyraz);
            if (wyraz.equals(nowyWyraz)) {
                System.out.println("Wyraz jest palindromem");
            } else {
                System.out.println("Wyraz nie jest palindromem");
            }
            int z = 2;

            for (int k = 0; k < wyraz.length(); k++) {
                if (wyraz.charAt(k) != wyraz.charAt((wyraz.length() - 1) - k)) {
                    z = 1;
                } else {
                    z = 0;
                }
            }

            if (z == 1) {
                System.out.println("Wyraz nie jest palindromem");
            } else {
                System.out.println("Wyraz jest palindromem");
            }

        }

    }
}
