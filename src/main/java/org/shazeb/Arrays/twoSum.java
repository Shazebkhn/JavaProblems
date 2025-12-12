package org.shazeb.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoSum {
    //    find pair in array with a given sum
    static void sumPair(int[] num, int sum) {
        List<Integer> list = new ArrayList<>();
        Integer[] nums = Arrays.stream(num).boxed().toArray(Integer[]::new);
        list.addAll(Arrays.asList(nums));
        for (int n : num) {
            if (list.contains(sum - n)) {
                System.out.println(" pair are: " + n + " " + (sum - n));
                break;
            }
        }
    }
}
