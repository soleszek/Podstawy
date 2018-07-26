package com.sylwesteroleszek.AbstractClass;

public class Szescian implements Solid {
    private float a;

    @Override
    public float getVolume() {
        return (float)Math.pow(a, 3);
    }

    @Override
    public float getSurfaceArea() {
        return 6 * a * a;
    }
}
