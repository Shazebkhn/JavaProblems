package org.shazeb.Arrays;

public class BinarySearch {
    //Binary search in sorted array
    static void binarySearch(int[] num, int n) {
        int l = 0, r = num.length - 1;
        int m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (num[m] == n) {
                System.out.println("Index is " + m);
                break;
            } else if ((num[m] > n)) {
                r = m-1;
            } else {
                l = m + 1;
            }
        }
    }
}
