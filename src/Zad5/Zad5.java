package Zad5;

public class Zad5 {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10 - i; j++ ) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
