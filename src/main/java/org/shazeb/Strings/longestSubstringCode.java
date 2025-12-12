package org.shazeb.Strings;

import java.util.*;

public class longestSubstringCode {

    public static void main(String[] args) {
        String input = "test testlol";
        System.out.println(longestSubstring1(input));
    }

    //longest substring without repeating characters

    static String longestSubstring1(String s){
       Map<Character, Integer> map = new HashMap<>();
       int left=0, bestlength = 0, bestStart = 0;

       for(int right = 0; right<s.length(); right++){
            char c  = s.charAt(right);
           if(map.containsKey(c) && map.get(c)>=left){
               left = map.get(c) + 1;
           }
           map.put(c,right);

           int winlength = right - left +1;
           if (winlength>bestlength){
               bestlength = winlength;
               bestStart = left;
           }
       }

       return s.substring(bestStart, bestStart+bestlength);

    }

      static String longestSubstring2(String s) {
          int n = s.length();
          int left = 0, right = 0;
          int bestStart = 0, bestLen = 0;
          Set<Character> seen = new HashSet<>();

          while (right < n) {
              char c = s.charAt(right);
              if (!seen.contains(c)) {
                  seen.add(c);
                  int winLen = right - left + 1;
                  if (winLen > bestLen) {
                      bestLen = winLen;
                      bestStart = left;
                  }
                  right++;
              } else {
                  // shrink from left until c can be added
                  while (s.charAt(left) != c) {
                      seen.remove(s.charAt(left));
                      left++;
                  }
                  // remove the duplicate occurrence at left and move left past it
                  seen.remove(s.charAt(left));
                  left++;
              }
          }
          return s.substring(bestStart, bestStart + bestLen);
      }



}
