package Zad3;

public class Zad3_Only2For {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
                for (int i = 0; i < 10; i++) {
                    if (n == 0 || n == 9) {
                    System.out.print("*");
                }
                else if (n > 0 && n < 9){
                        if (i == 0 || i == 9) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
            }
            System.out.println();
        }
    }
}
