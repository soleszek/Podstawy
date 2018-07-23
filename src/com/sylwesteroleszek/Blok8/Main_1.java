package com.sylwesteroleszek.Blok8;

public class Main_1 {
    public static void main(String[] args) {
        Room kuchniaParter = new Room(12, 2);
        Room lazienkaParter = new Room(8, 2);
        Room biuroKasi = new Room(11, 2);
        Room garderoba = new Room (13, 2);
        Room sypialnia = new Room (12,2);
        Room duzyPietro = new Room (27, 12);

        Room[] pokoje = {biuroKasi, garderoba, sypialnia, duzyPietro};

        House wisniowa7 = new House("Wiśniowa 7", kuchniaParter, lazienkaParter, pokoje );
        System.out.println(wisniowa7.getArea(kuchniaParter, lazienkaParter, pokoje));
    }
}
