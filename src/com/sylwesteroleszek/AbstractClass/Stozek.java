package com.sylwesteroleszek.AbstractClass;

public class Stozek implements Solid {

    private float r;
    private float hDuze;
    private float l;

    public Stozek(float r, float hDuze, float l) {
        this.r = r;
        this.hDuze = hDuze;
        this.l = l;
    }

    @Override
    public float getVolume() {
        return (1/3) * PI * r * r * hDuze;
    }

    @Override
    public float getSurfaceArea() {
        return PI * r * (l * r);
    }

    public float getPI() {
        return PI;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float gethDuze() {
        return hDuze;
    }

    public void sethDuze(float hDuze) {
        this.hDuze = hDuze;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }
}
