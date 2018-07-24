package com.sylwesteroleszek.Blok8.Lock;

import java.util.Arrays;
import java.util.Random;

public class Lock3Rolki_1 {

        private final int[] SOLVER = {7, 2, 3};
        private int[] currentCode;

        public Lock3Rolki_1() {
            currentCode = new int[3];
            Random random = new Random();
            for (int i = 0; i < currentCode.length; i++) {
                currentCode[i] = random.nextInt(10);
            }
        }

        public void increment (int row) {
            if (row < currentCode.length) {
                if (currentCode[row] == 9) {
                    currentCode[row] = 0;
                } else {
                    currentCode[row]++;
                }
            } else {
                System.out.println("Nie ma rolki o takim numerze, istnieją tylko + " + currentCode.length + " rolki");
            }
        }

        public void check () {
            if (Arrays.equals(currentCode, SOLVER)) {
                System.out.println("Zamek otwarty");
            } else {
                System.out.println("Zamek zamknięty");
            }
        }

        public void printCurrentCode () {
            System.out.println(Arrays.toString(currentCode));
        }

    public void setCurrentCode(int[] currentCode) {
        this.currentCode = currentCode;
    }

    public int[] getSOLVER() {
        return SOLVER;
    }

    public int[] getCurrentCode() {
        return currentCode;
    }
}
