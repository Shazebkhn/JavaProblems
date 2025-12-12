package org.shazeb.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class largestSumSubarray {
    //Given an integer array nums, find the subarray with the largest sum, and return its sum.

    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.println(largestSum(num));
        System.out.println(maxSubArray(num));
    }

    //optimmal solution
    static int largestSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 0) return 0;

        int sum = 0, bestsum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            bestsum = Math.max(sum, bestsum);

        }
        return bestsum;
    }

    // Returns the maximum subarray sum (Kadane's algorithm)
    static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend previous subarray or start fresh at nums[i] [12][9]
            currentSum = Math.max(nums[i], currentSum + nums[i]); // f[i] = max(nums[i], f[i-1]+nums[i]) [12][9]
            maxSum = Math.max(maxSum, currentSum); // track global maximum [12][1]
        }
        return maxSum;
    }


    public static class missingNumber {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            list.add(2);
            list.add(3);
            duplicate(list);
        }

        static int missingNum(int[] input){
            // calculate sum
            int expected =0;
            int lastNum = input[input.length-1];
            int sum = (lastNum*(lastNum+1))/2;
            int subtractor = input[0]-1;
            int diff = (subtractor*(subtractor+1))/2;
            expected = sum - diff;
            int actual = 0;
            for (int i: input){
                actual += i;
            }
    //        System.out.println(actual);
            return expected-actual;

        }

        static void wordOccur(String str, String word){
            String[] arr = str.split(" ");
            int i=0;
            for (String str1: arr){
                if(str1.equals(word)) i++;
            }
            System.out.println("word occured "+i+ " times");

        }

        static void duplicate(List<Integer> list){
            Set<Integer> set  = new HashSet<>(list);
            System.out.println(set);
        }
        }
}

