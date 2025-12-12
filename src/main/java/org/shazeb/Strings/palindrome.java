package org.shazeb.Strings;

public class palindrome {
    public static void main(String[] args) {
        palindrom("ababa");
    }
    static void palindrom(String str) {
        char[] arr = str.toCharArray();
        String nnewstr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            nnewstr += arr[i];
        }
        if (str.equals(nnewstr)) {
            System.out.println("Palindrom");
        } else System.out.println("not palindrome");
    }
}
