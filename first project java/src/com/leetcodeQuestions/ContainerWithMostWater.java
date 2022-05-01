package com.leetcodeQuestions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {2,2,2,30,30,2,2,2,};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int maxWater=0;
        int left=0;
        int right=height.length-1;
        while(left < right) {
            maxWater = Math.max(maxWater,(right - left) * Math.min(height[left], height[right]));
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}
