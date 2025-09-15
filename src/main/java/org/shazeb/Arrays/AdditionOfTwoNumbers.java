package org.shazeb.Arrays;

import java.util.HashMap;
import java.util.Map;

public class AdditionOfTwoNumbers {

   /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.*/

    public static void main(String[] args) {
        int[] num = {2,4,6,7,10,27,5,8};
        numberAdditionEqualToTarget(num, 13);
        numberAdditionUsingMap(num, 13);
    }

    static void numberAdditionEqualToTarget(int[] num, int target){
        for(int i=0; i<num.length-1; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]<=target &&  num[i]+num[j]==target){
                    System.out.println("Indexes are "+i+" and "+j);
                }
            }
        }
    }

    //Optimal solution using hashmap
    static void numberAdditionUsingMap(int[] num, int target){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<num.length; i++){
            int diff = target- num[i];
            if(mp.containsKey(diff)){
                System.out.println("Indexes using map are "+i+"and "+mp.get(diff));
            }
            mp.put(num[i],i);
        }
    }
}
