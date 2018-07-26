package com.sylwesteroleszek.AbstractClass;

public class Main {
    public static void main(String[] args) {

        Rectangle kwadrat = new Rectangle(4, 4);
        Rectangle prostokat = new Rectangle(4, 6);

        PerpendicularSolid perpendicularSolid = new PerpendicularSolid(10f, kwadrat, prostokat);

        System.out.println(perpendicularSolid.getArea());
        System.out.println(perpendicularSolid.getVolume());
    }
}
