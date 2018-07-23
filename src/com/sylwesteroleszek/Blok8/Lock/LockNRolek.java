package com.sylwesteroleszek.Blok8.Lock;

import java.util.Arrays;
import java.util.Random;

public class LockNRolek {
    private int[] solver;
    private int[] currentCode;

    public LockNRolek (int[] solver) {
        this.solver = solver;
        currentCode = new int[solver.length];
        Random random = new Random();
        for (int i = 0; i < currentCode.length; i++) {
            currentCode[i] = random.nextInt(10);
        }
    }

    public void increment(int row) {
        if (row < currentCode.length) {
            if (currentCode[row] == 9) {
                currentCode[row] = 0;
            } else {
                currentCode[row]++;
            }
        } else {
            System.out.println("Nie ma rolki o takim numerze, istnieją tylko " + currentCode.length + " rolki");
        }
    }

    public void check() {
        if (Arrays.equals(currentCode, solver)) {
            System.out.println("Zamek otwarty!");
        } else {
            System.out.println("Zamek zamknięty");
        }
    }

    public void printCurrentCode() {
        System.out.println(Arrays.toString(currentCode));
    }

    public void setCurrentCode(int[] currentCode) {
        this.currentCode = currentCode;
    }

    public int[] getSolver() {
        return solver;
    }

    public int[] getCurrentCode() {
        return currentCode;
    }
}
