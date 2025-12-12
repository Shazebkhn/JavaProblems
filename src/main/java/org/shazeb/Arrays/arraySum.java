package org.shazeb.Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class arraySum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] num2 = {-1,-2,4,5,3,-1,2};
//        twoSum(num,6);
        threeSum(num2);

    }

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    static void twoSum(int[] num, int sum){
       Map<Integer, Integer> mp = new HashMap<>();

       for(int i=0;i< num.length; i++){
           int diff = sum-num[i];
           if(mp.containsKey(diff)) {
               System.out.println("Indexes are " + i + " " + mp.get(diff));
               break;
           }
           mp.put(num[i],i);
       }
    }

//    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
//    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
    static void threeSum(int[] nums ){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        if(nums[0]>0) return;

        for (int i = 0; i < n-2; i++) {

            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) break;

            int left = i+1, right = n-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(sum>0) right--;
                else if(sum<0) left++;
                else {
                    System.out.println(nums[i]+" "+nums[left]+" "+nums[right]);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }

            }


        }
    }
}
