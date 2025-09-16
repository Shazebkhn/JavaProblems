package org.shazeb.Arrays;

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



}

