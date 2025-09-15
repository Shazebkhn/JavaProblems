package org.shazeb;

import java.util.Arrays;

public class arrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateKtimes(arr, 1)));
        rotateRight(arr,2);
    }

    static int[] rotateKtimes(int[] arr, int k){
        int length = arr.length;
        int effecitveK = k%length;
        int breakPointndex = length-effecitveK;
        int[] newArray = new int[length];
        for (int i=breakPointndex,j=0; i<length; i++,j++){
            newArray[j] = arr[i];
        }
        for (int i=0,j=effecitveK; i<breakPointndex; i++,j++){
            newArray[j] = arr[i];
        }
        return newArray;
    }


        public static void rotateRight(int[] a, int k) {
            int n = a.length;
            if (n == 0) return;
            k %= n;                 // handle k >= n
            if (k == 0) return;

            reverse(a, 0, n - 1);   // reverse whole
            reverse(a, 0, k - 1);   // reverse first k
            reverse(a, k, n - 1);   // reverse rest
            System.out.println(Arrays.toString(a));
        }

        private static void reverse(int[] a, int l, int r) {
            while (l < r) {
                int tmp = a[l];
                a[l++] = a[r];
                a[r--] = tmp;
            }
        }



}
