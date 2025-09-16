package org.shazeb.Arrays;

public class largestProductSubarray {
    //Given an integer array nums, find a subarray that has the largest product, and return the product.
    //
    //The test cases are generated so that the answer will fit in a 32-bit integer.

    public static void main(String[] args) {
       int[] num = {-2,0,-1};
        System.out.println(maxProduct(num));
    }

    static int maxProduct(int[] nums){
        int currProd = nums[0];
        int maxProd = nums[0];

        for (int i=1; i<nums.length; i++){
            currProd = Math.max(nums[i], currProd*nums[i]);
            maxProd = Math.max(currProd,maxProd);
        }
        return maxProd;
    }
}
