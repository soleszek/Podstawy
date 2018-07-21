package com.sylwesteroleszek.Blok7;

public class Vehicle_1 {
    private int speed;
    private int maxSpeed;
    private int wheelCount;

    public Vehicle_1(int speed, int maxSpeed, int wheelCount) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public String toString() {
        return "Predkość wynosi: " + speed + ", maksymalna predkość wynosi: " + maxSpeed + ", liczba kół wynosi: " + wheelCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
