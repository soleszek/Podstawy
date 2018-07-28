package Zad6;

public class Zad6 {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            if (i < 12) {
                for (int j = 0; j < 11 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i; k++) {
                    System.out.print("*");
                }
                System.out.println();

            } else if (i > 11) {
                for (int l = 0; l < 8; l++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 6; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
