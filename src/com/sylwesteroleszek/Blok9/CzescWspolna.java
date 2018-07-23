package com.sylwesteroleszek.Blok9;

import java.util.Arrays;

public class CzescWspolna {
    public static void main(String[] args) {

        Integer [] tablica1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 200, 5, 6, 5};
        Integer [] tablica2 = {12, 2, 3, 2, 200, 5};

        Integer[] tablicaCommon = commonPart(tablica1, tablica2);
        String str = Arrays.toString(tablicaCommon);
        System.out.println(str);
        tablicaCommon = removeArrayDuplicates(tablicaCommon);
        str = Arrays.toString(tablicaCommon);
        System.out.println(str);
    }

    public static Integer[] commonPart (Integer[] tablica1, Integer[] tablica2) {
        Integer[] tablicaCommon = new Integer[(tablica1.length < tablica2.length) ? tablica1.length : tablica2.length];
        Integer[] small = (tablica1.length < tablica2.length) ? tablica1 : tablica2;
        Integer[] big = (tablica1.length < tablica2.length) ? tablica2 : tablica1;

        boolean found = false;

        for(int i = 0; i < small.length; i++) {
            found = arrayContains(big, small[i]);
            if (found == true ) {
                tablicaCommon[i] = small[i];
            }
        }

        return tablicaCommon;
    }

    public static Integer[] removeArrayDuplicates(Integer[] a) {
        int len = a.length;
        int dups = 0;
        boolean noNulls = false;

        for (int i =0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                noNulls = a[i] != null & a[j] != null;

                if (noNulls && a[i].equals(a[j])) {
                    a[j] = null;
                    dups++;
                }
            }
        }
        return a;
    }

    public static boolean arrayContains(Object[] a, Integer b) {
        boolean contains = false;

        for (Object c : a) {
            if (c != null && c.equals(b)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

}
