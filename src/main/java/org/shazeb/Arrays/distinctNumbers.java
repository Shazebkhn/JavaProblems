package org.shazeb.Arrays;

import java.util.HashSet;
import java.util.Set;

public class distinctNumbers {
//    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    public static void main(String[] args) {
        int[] num = {2,2,4,5,6,};
        System.out.println(checkDistinctNumbers(num));
    }

    static boolean checkDistinctNumbers(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int n: nums){
            set.add(n);
        }
        if(nums.length == set.size()) return true;
        else return false;
    }
}
