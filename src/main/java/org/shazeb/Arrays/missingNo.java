package org.shazeb.Arrays;

public class missingNo {
    public static void main(String[] args) {
//        missingNumber("");
    }
    //missing number for array of 1 to n
    static void missingNumber(int[] num) {
        int l = num[num.length - 1];
        int expectedSum = (l * (l + 1)) / 2;
        int actualSum = 0;
        for (int n : num) {
            actualSum += n;
        }

        System.out.println("missing number " + (expectedSum - actualSum));
    }
}
