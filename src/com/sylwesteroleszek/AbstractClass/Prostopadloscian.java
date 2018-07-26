package com.sylwesteroleszek.AbstractClass;

public class Prostopadloscian implements Solid{

    private float a;
    private float b;
    private float hDuze;

    public Prostopadloscian(float a, float b, float hDuze) {
        this.a = a;
        this.b = b;
        this.hDuze = hDuze;
    }

    @Override
    public float getVolume() {
        return a * b * hDuze;
    }

    @Override
    public float getSurfaceArea() {
        return (4 * (a + b)) + 2 * a * hDuze + 2 * b * hDuze;
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

    public float gethDuze() {
        return hDuze;
    }

    public void sethDuze(float hDuze) {
        this.hDuze = hDuze;
    }
}
