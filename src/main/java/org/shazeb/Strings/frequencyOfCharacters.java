package org.shazeb.Strings;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        frequiency("just this above");
    }
    //frequency of each character in a string
    static void frequiency(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : str.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (Character ch : mp.keySet()) {
            System.out.println("Character \"" + ch + "\" occured " + mp.get(ch) + " times");
        }
    }
}
