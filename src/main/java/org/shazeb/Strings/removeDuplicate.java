package org.shazeb.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {

    public static void main(String[] args) {
        removeDuplicates("holy moly holy");
    }
    //remove duplicate characters from a string
    static void removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }
        String result = "";
        for (Character c : set) {
            result += c;
        }
        System.out.println(result);
    }
}
