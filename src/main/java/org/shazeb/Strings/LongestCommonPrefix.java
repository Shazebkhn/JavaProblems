package org.shazeb.Strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        if(strs.length == 1) return first;
        StringBuilder str = new StringBuilder();
        for(int i=1; i<strs.length; i++){
            int j=0, n= Math.min(first.length(),strs[i].length());
            System.out.println("----------------");
            System.out.println(first);
            System.out.println(strs[i]);
            System.out.println(n);

            while(j<n){
                if(first.charAt(j)==strs[i].charAt(j)){
                    str.append(first.charAt(j++));
                    System.out.println(str);
                }
                else break;
            }
            System.out.println("a gya");
            first = str.toString();
            str.setLength(0);
        }
        return first;
    }
}
