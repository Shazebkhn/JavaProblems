package org.shazeb.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        secondLargetNumber(new int[]{2,3,4,11,2,44,12,2,12});
    }
    //Second largest number in a array
    static void secondLargetNumber(int[] num) {
        int largest = 0, second = 0;
        for (int i : num) {
            if (i > largest) {
                second = largest;
                largest = i;
            } else if (i > second)
                second = i;
        }
        System.out.println(second);
    }
}
