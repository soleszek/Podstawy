package com.sylwesteroleszek.InterfejsProduct;

public class ChocolateBar implements Product {

    private int cena;
    private int waga;

    public ChocolateBar(int cena, int waga) {
        this.cena = cena;
        this.waga = waga;
    }

    @Override
    public int getPrice() {
        return cena;
    }

    @Override
    public int getWeight() {
        return waga;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }
}
