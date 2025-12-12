package org.shazeb.Strings;

public class stringReverse {

    //revers using string reverse function
    String reverseWithInbuilt(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    String reverUsingCharArray(String str){
        char[] arr = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i=arr.length-1; i>=0; i--){
            reversed.append(String.valueOf(arr[i]));
        }
        return reversed.toString();
    }

    String reverseUsingSubString(String str){
        StringBuilder reverse = new StringBuilder();
        for (int i= str.length()-1; i>=0; i--){
            reverse.append(str.substring(i,i+1));
        }
        return reverse.toString();
    }

    String reverseUsingChatAt(String str){
        String reverse = "";
        for(int i=str.length()-1; i>=0;i--){
          reverse = reverse.concat(String.valueOf(str.charAt(i)));
        }
        return reverse;
    }

}
