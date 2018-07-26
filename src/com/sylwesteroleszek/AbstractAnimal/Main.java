package com.sylwesteroleszek.AbstractAnimal;

public class Main {


    public static void main(String[] args) {
        Dog amir = new Dog();
        Cat mruczek = new Cat();
        Mouse czesiek = new Mouse();

        amir.makeASound();
        mruczek.makeASound();
        czesiek.makeASound();
    }
}
