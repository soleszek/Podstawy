package com.sylwesteroleszek.InterfejsProduct;

public class Milk implements Product {

    private int objetosc;
    private int gestosc;
    private int cenaZa100Gram;

    @Override
    public int getPrice() {
        return cenaZa100Gram;
    }

    @Override
    public int getWeight() {
        return objetosc * gestosc;
    }
}