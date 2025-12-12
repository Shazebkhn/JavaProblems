package org.shazeb.Strings;

import java.util.HashMap;
import java.util.Map;

public class duplicateWords {
    public static void main(String[] args) {
        String str = "hello world hello world happy man man";
        dupplicateWoreds(str);
    }

    static void dupplicateWoreds(String str){
        String[] strArr = str.split(" ");
        Map<String, Integer> mp = new HashMap<>();
        for(String s: strArr){
            if(mp.containsKey(s)){
                int newkey = mp.get(s)+1;
                mp.put(s,newkey);
            }
            else mp.put(s,1);
        }
        for(String dup: mp.keySet()){
            if(mp.get(dup)>1)
                System.out.println("Word: "+ dup+ " Occurance: "+ mp.get(dup));
//            else System.out.println(" No Duplicates found");
        }
    }
}
