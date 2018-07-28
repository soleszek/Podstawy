package Zad3;

public class Zad3 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int k = 1; k < 9; k++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || j == 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int l = 0; l < 10; l++) {
            System.out.print("*");
        }
    }
}
