package com.sylwesteroleszek.Blok8.House;

public class Room {
    private int area;
    private int height;

    public Room() {};

    public Room(int area, int height) {
        this.area = area;
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
