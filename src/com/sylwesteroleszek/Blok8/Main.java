package com.sylwesteroleszek.Blok8;

public class Main {
    public static void main(String[] args) {
        Room duzy = new Room(35, 2);
        Room salon = new Room(40, 2);
        Room maly = new Room (15, 2);
        Room kuchnia = new Room(17, 2);
        Room lazienka = new Room (8, 2);

        Room[] pokoje = {duzy, salon, maly};

        House domWisniowa = new House("Wiśniowa 7", kuchnia, lazienka, pokoje);

        System.out.println("Powierzchnia domu wynosi: " + domWisniowa.getArea(kuchnia, lazienka, pokoje));
    }
}
