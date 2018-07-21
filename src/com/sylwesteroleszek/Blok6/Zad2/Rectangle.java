package com.sylwesteroleszek.Blok6.Zad2;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {};

    public int getArea () {
        int area = a * b;
        return area;
    }

    public int getPerimeter () {
        int perimeter = (2*a) + (2*b);
        return perimeter;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
