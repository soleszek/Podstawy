package com.sylwesteroleszek.Blok6.Zad2;

public class Circle {
    private float PI = 3.14f;
    private float radius;

    public Circle (float radius) {
        this.radius = radius;
    }

    public Circle() {};

    public float getArea() {
        float area = PI * radius *radius;
        return area;
    }

    public float getPerimeter() {
        float perimeter = 2 * PI * radius;
        return perimeter;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
