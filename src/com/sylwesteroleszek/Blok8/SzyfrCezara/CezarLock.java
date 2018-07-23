package com.sylwesteroleszek.Blok8.SzyfrCezara;

public class CezarLock {

    //32 - 122

    public static void main(String[] args) {
        String wiadomosc = "Sylwester jest programistą";

        System.out.println(cipher(wiadomosc, '9'));
    }

    public static String cipher(String string, char sign) {

        int przesuniecie = Character.getNumericValue(sign);
        StringBuilder sb = new StringBuilder(string);

        for (int i = 0; i < string.length(); i++) {
            int c = (int)string.charAt(i);
            if ((c + przesuniecie) > 122) {
                c = 31 + (przesuniecie - (122 - c));
            } else {
                c += przesuniecie;
            }

            sb.setCharAt(i, (char)c);
        }

        return sb.toString();
    }
}
