package com.sylwesteroleszek.Blok8.House;

public class House_1 {
    private String address;
    private Room kitchen;
    private Room bathroom;
    private Room[] rooms;

    public House_1(String address, Room kitchen, Room bathroom, Room[] rooms) {
        this.address = address;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    public int getArea (Room kitchen, Room bathroom, Room[] rooms) {
        int area = 0;

        for (int i = 0; i < rooms.length; i++) {
            area += rooms[i].getArea();
        }

        area = kitchen.getArea() + bathroom.getArea();

        return area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getKitchen() {
        return kitchen;
    }

    public void setKitchen(Room kitchen) {
        this.kitchen = kitchen;
    }

    public Room getBathroom() {
        return bathroom;
    }

    public void setBathroom(Room bathroom) {
        this.bathroom = bathroom;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
