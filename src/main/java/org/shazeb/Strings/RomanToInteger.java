package org.shazeb.Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    //Convert Roman numerals to integer
    static void romanToInteger(String roman) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        char[] arr = roman.toCharArray();
        int current = arr.length - 1;
        int result = 0;
        int pre = 0;
        while (current >= 0) {
            if (pre > 0 && mp.get(arr[current]) < mp.get(arr[pre])) {
                result -= mp.get(arr[current]);
                pre = current;
                current--;

            } else {
                result += mp.get(arr[current]);
                pre = current;
                current--;
            }
        }
        System.out.println(result);
    }
}
