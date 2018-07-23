package com.sylwesteroleszek.Blok8;

public class Party {

    private Osoba host;
    private Osoba[] attendees;

    public Party(Osoba host, Osoba[] attendees) {
        this.host = host;
        this.attendees = attendees;
    }

    public int getAverageAge (Osoba[] attendees) {
        int averageAge = 0;

        for (int i = 0; i < attendees.length; i++) {
            averageAge += attendees[i].getWiek();
        }
        averageAge = averageAge / attendees.length;
        return averageAge;
    }

    public Osoba getHost() {
        return host;
    }

    public void setHost(Osoba host) {
        this.host = host;
    }

    public Osoba[] getAttendees() {
        return attendees;
    }

    public void setAttendees(Osoba[] attendees) {
        this.attendees = attendees;
    }
}
