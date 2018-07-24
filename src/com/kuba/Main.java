package com.kuba;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stos = new Stos<>();

        stos.push(0);
        System.out.println(stos.toString());
        stos.push(1);
        System.out.println(stos.toString());
        stos.push(2);
        System.out.println(stos.toString());
        stos.push(3);
        System.out.println(stos.toString());
        stos.push(4);
        System.out.println(stos.toString());
        stos.push(10);
        System.out.println(stos.toString());

        System.out.println(stos.peek());
        System.out.println(stos.pop());
        System.out.println(stos.peek());
    }
}
