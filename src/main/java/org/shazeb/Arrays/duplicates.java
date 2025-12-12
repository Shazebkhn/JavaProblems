package org.shazeb.Arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicates {
    // find duplicates from array
    static void duplicate(int[] num) {
        Set<Integer> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int n : num) {
            if (set.contains(n))
                result.append("\n").append(n);
            else set.add(n);
        }
        System.out.println(result);
    }
}
