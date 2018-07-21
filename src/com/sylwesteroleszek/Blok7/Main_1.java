package com.sylwesteroleszek.Blok7;

public class Main_1 {
    public static void main(String[] args) {
        Vehicle_1 vehicle_1 = new Vehicle_1(50, 180, 4);
        System.out.println(vehicle_1.toString());

        Car_1 car_1 = new Car_1(45, 165, 2, 1368, 5);
        System.out.println(car_1.toString());

        Bicycle_1 bicycle_1 = new Bicycle_1(20, 45, 1, 26, 18);
        System.out.println(bicycle_1.toString());
    }
}
