package org.shazeb.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class anagramString {

    String anagram(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c : arr1){
            set1.add(c);
        }
        for(char c : arr2){
            set2.add(c);
        }
        if(set1.equals(set2)) return "Anagram";
        else return "Not Anagram";

    }

    String anamgramUsingSort(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)) return "Anagram";
        else return "not Aanagram";

    }
}
