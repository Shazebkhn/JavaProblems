package org.shazeb.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class productOfNumbers {

    /*Given an integer array nums, return an array answer such that
    answer[i] is equal to the product of all the elements of nums except nums[i]*/

    public static void main(String[] args) {
        int[] num = {2,3,4,0,5};
//        int[] result = productOfNumber(num);
//        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(productInTwoPhase(num)));
    }

    static int[] productOfNumber(int[] nums){
        int[] result = new int[nums.length];
        int totalProduc =1;
        for(int n: nums){
            totalProduc = totalProduc*n;
        }
        for(int i=0; i< result.length; i++){
            result[i] = totalProduc/nums[i];
        }
        return result;
    }

    //optimal solution to avoid division by zero situation

    static int[] productInTwoPhase(int[] nums){
        int[] result = new int[nums.length];
        int leftprod =1, rightprod = 1;

        for(int i=0; i<nums.length; i++){
            result[i] = leftprod;
            leftprod *= nums[i];
        }
        for(int i= nums.length-1; i>=0; i--){
            result[i] *= rightprod;
            rightprod *= nums[i];
        }


        return result;
    }
}
