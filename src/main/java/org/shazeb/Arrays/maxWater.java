package org.shazeb.Arrays;

public class maxWater {
    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

   /* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

    Find two lines that together with the x-axis form a container, such that the container contains the most water.

    Return the maximum amount of water a container can store.*/
    public static int maxArea(int[] height) {
        int l=0, r=height.length-1, currArea , maxArea = 0;
        int width, currHeight;
        while(l<r){
            currHeight = Math.min(height[l], height[r]);
            width = r-l;
            currArea = currHeight * width;
            maxArea = Math.max(maxArea, currArea);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxArea;
    }
}
