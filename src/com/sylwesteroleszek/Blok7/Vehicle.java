package com.sylwesteroleszek.Blok7;

public class Vehicle {
    private int speed;
    private int maxSpeed;
    private int wheelCount;

    public Vehicle(int speed, int maxSpeed, int wheelCount) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    @Override
    public String toString() {
        return "Prędkość wynosi: " + speed + " Maksymalna prędkość wynosi: " + maxSpeed + " Liczba kół wynosi: " + wheelCount;
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
