package com.sylwesteroleszek.Blok6.Zad2;

public class Triangle {
    private float a;
    private float b;
    private float c;
    private float h;

    public Triangle(float a, float b, float c, float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public Triangle() {};

    public float getArea() {
        float pole = 0.5f * a * h;
        return pole;
    }

    public float getPerimeter() {
        float obwod = a + b + c;
        return obwod;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
}
