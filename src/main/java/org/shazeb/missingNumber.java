package org.shazeb;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//8) Given a string, find the length of the longest substring without repeating characters
//14) Write a Java Program to check if two strings are anagram of each other or not.
//- Java program to find 2nd max element from an array and later asked to debug.
//- Later asked for POJO classes and how I am sending requests and extracting responses in API automation. Write the logic
//- Fetch 2nd and then 3rd largest salary of emp with name.
//- Fetch duplicate emp ID records from the employee table.


public class missingNumber {

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
