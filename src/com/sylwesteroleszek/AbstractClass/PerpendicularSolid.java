package com.sylwesteroleszek.AbstractClass;

public class PerpendicularSolid {

    private float h;

    Shape podstawa1;
    Shape podstawa2;

    public PerpendicularSolid(float h, Shape podstawa1, Shape podstawa2) {
        this.h = h;
        this.podstawa1 = podstawa1;
        this.podstawa2 = podstawa2;
    }

    public float getVolume() {

        return podstawa1.getArea() * h;
    }

    public float getArea() {

        return 2 * podstawa1.getArea() + 4 * podstawa2.getArea();

    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public Shape getPodstawa1() {
        return podstawa1;
    }

    public void setPodstawa1(Shape podstawa1) {
        this.podstawa1 = podstawa1;
    }

    public Shape getPodstawa2() {
        return podstawa2;
    }

    public void setPodstawa2(Shape podstawa2) {
        this.podstawa2 = podstawa2;
    }
}
