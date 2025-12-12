package org.shazeb.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("this is the end"));
    }
    static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> mp = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        char result = 0;
        for (char c : arr) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (Character ch : mp.keySet()) {
            if (mp.get(ch) == 1) {
                result = ch;
                break;
            }
        }
        return result;
    }
}
