package com.sylwesteroleszek.Blok8;

public class House extends Room {
    private String address;
    private Room kitchen;
    private Room bathroom;
    private Room[] rooms;

    public House(String address, Room kitchen, Room bathroom, Room[] rooms) {
        this.address = address;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    public int getArea(Room kitchen, Room bathroom, Room[] rooms) {
        int liczbaPokoi = rooms.length;
        int powierzchniaDomu = 0;

        for(int i = 0; i < liczbaPokoi; i++) {

            powierzchniaDomu += rooms[i].getArea();
        }

        powierzchniaDomu += kitchen.getArea() + bathroom.getArea();

        return powierzchniaDomu;
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
