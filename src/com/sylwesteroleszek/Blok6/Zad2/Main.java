package com.sylwesteroleszek.Blok6.Zad2;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(2.5f);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle = new  Triangle(2f, 3f, 4f, 1.5f);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

}
