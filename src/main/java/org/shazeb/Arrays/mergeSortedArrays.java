package org.shazeb.Arrays;

import java.util.ArrayList;
import java.util.List;

public class mergeSortedArrays {
    //merge to sorted arrays
    static void mergeTwoSortedArrays(int[] n1, int[] n2) {
        List<Integer> finalArray = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n1.length || j < n2.length) {
            if (i < n1.length && n1[i] < n2[j]) {
                finalArray.add(n1[i]);
                i++;
            } else if (j < n1.length) {
                finalArray.add(n2[j]);
                j++;
            }
        }
        System.out.println(finalArray);
    }

}
