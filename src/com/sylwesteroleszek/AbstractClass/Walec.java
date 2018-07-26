package com.sylwesteroleszek.AbstractClass;

public class Walec implements Solid {

    private float r;
    private float hDuze;


    @Override
    public float getVolume() {
        return PI * r * r * hDuze;
    }

    @Override
    public float getSurfaceArea() {
        return (2 * PI * r * r) + (2 * PI * r *hDuze);
    }
}
