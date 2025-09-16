package org.shazeb.Arrays;

public class RotatedSortedArrayMin {
    public static void main(String[] args) {
//        int[] num = {3,4,5,6,7,8,2};
        int[] num = {3, 1, 2};
        System.out.println(minRotatedArray(num));
    }


    //binary search and use logic that first element< last element then rotated elements exists
    static int minRotatedArray(int[] num) {
        int lo = 0, hi = num.length - 1;

        if (num[lo] <= num[hi]) return num[lo];//rotated n time or contains 1 elementl

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            System.out.println("lo: " + lo + " hi: " + hi + " mid: " + mid);
            System.out.println("lo val: " + num[lo] + " hi val: " + num[hi] + " mid: " + num[mid]);

            if (num[mid] > num[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return num[lo];
    }
}

