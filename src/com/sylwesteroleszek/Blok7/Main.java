package com.sylwesteroleszek.Blok7;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(50, 175, 4);
        System.out.println(vehicle.toString());

        Car punto = new Car(65, 170, 4, 1368, 5);
        System.out.println(punto.toString());

        Bicycle wheeler = new Bicycle(18, 45, 2, 26, 18);
        System.out.println(wheeler.toString());
    }
}
