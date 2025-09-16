package org.shazeb.Arrays;

public class RotatedSortedArrayMin {
    public static void main(String[] args) {
        int[] num = {3,4,5,6,7,8,2};
        System.out.println(minRotatedArray(num));
    }


    //binary search and use logic that first element< last element then rotated elements exists
    static int minRotatedArray(int[] num){
        int lo = 0, hi = num.length-1;

        if(num[lo]<=num[hi]) return num[lo];//rotated n time or contains 1 elementl

        while(hi-lo>=1){
//            System.out.println( "lo: " + lo + "hi: " +hi);

            int mid = lo + (hi-lo)/2;
            if(num[lo]>num[mid]){
//                System.out.println( "lo: " + lo + "mid: " +mid);
                hi = mid;
            }
            else{
                lo = mid;
            }
        }
        return num[lo];
    }
}

