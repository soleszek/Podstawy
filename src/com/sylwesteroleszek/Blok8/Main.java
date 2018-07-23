package com.sylwesteroleszek.Blok8;

public class Main {
    public static void main(String[] args) {
        Osoba sylwek = new Osoba("Sylwester", 35);
        Osoba kasia = new Osoba("Katarzyna", 35);
        Osoba konrad = new Osoba("Konrad", 29);
        Osoba lukasz = new Osoba("Łukasz", 29);

        Osoba[] osobas = {kasia, konrad, lukasz};

        Party party = new Party (sylwek, osobas);
        System.out.println(party.getAverageAge(osobas));
    }
}
