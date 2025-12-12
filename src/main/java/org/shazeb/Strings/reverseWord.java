package org.shazeb.Strings;

public class reverseWord {

    //reverse each word in a sentnece
    static void reverseWords(String str) {
        String[] sArr = str.trim().split(" ");
        StringBuilder finalresult = new StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(sArr[i]);
            stringBuilder.reverse();
            if (i < sArr.length - 1)
                finalresult.append(stringBuilder).append(" ");
            else finalresult.append(stringBuilder);
        }
        System.out.println(finalresult);

    }
}
