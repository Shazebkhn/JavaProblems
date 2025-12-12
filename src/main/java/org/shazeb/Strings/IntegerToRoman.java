package org.shazeb.Strings;

public class IntegerToRoman {
    //Integer to Roman, works for 1 to 3999
    static void IntegerToRoman(int num) {
        final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < VALUES.length; i++) {
            while (num >= VALUES[i]) {
                num -= VALUES[i];
                System.out.print(SYMBOLS[i]);
            }
        }
    }
}
