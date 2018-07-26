package com.sylwesteroleszek.AbstractClass;

public class Circle extends Shape {
    private float radius;
    private final float PI = 3.14f;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return PI * radius * radius;
    }

    @Override
    public float getPerimeter() {
        return 2 * PI * radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPI() {
        return PI;
    }
}
