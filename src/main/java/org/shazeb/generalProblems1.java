package org.shazeb;

import java.util.*;

public class generalProblems1 {
    public static void main(String[] args) {

    }



    public static int strStr(String haystack, String needle) {
        int j=0, index=Integer.MAX_VALUE;
        for(int i=0; i<haystack.length(); i++){

            if(haystack.charAt(i)==needle.charAt(j)){
                index = Math.min(index, i);
                System.out.print(index);
                if(j==needle.length()-1){
                    return index;
                }
                j++;
            }

            else{
                System.out.print("come here");
                j=0; index=Integer.MAX_VALUE;
            }
        }
        return -1;

    }


}
