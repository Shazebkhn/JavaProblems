package org.shazeb.Arrays;

import java.util.Arrays;

public class arrayRotation {

    public static void main(String[] args) {
        int[] num = {0, 1, 2, 4, 5, 6};
        System.out.println(Arrays.toString(rightRotateArray(num, 2)));
    }

    static int[] rightRotateArray(int[] num, int k) {
        int len = num.length - 1;
        int[] num1 = reverseArray(num, 0, len);
        System.out.println("first pass" + Arrays.toString(num1));
        num1 = reverseArray(num1, 0, k - 1);
        System.out.println("second pass" + Arrays.toString(num1));
        num1 = reverseArray(num1, k, len);
        System.out.println("third pass" + Arrays.toString(num1));
        return num1;
    }

    static int[] reverseArray(int[] num, int first, int last) {
        for (int i = first; i <= last; i++) {
            int temp = num[i];
            num[i] = num[last];
            num[last] = temp;
            last--;
        }
        return num;
    }


}
