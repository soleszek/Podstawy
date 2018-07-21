package com.sylwesteroleszek.Blok4;

public class Zad2 {

    public static void main(String[] args) {
        String lancuch1 = "Sylwester";
        String lancuch2 = "Sylw";

        sprawdz(lancuch1, lancuch2);
    }

    public static void sprawdz(String lancuch1, String lancuch2) {

        if (lancuch1.contains(lancuch2)) {
            System.out.println("Łańcuch pierwszy zawiera łańcuch drugi");
        } else {
            System.out.println("Łańcuch pierwszy nie zawiera łańcucha drugiego");
        }
    }

}
