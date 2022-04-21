package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,5,3,4,6,1,1,3,5,6,4,4,1};
        int[] arr2={2,2,1,11,9,6};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;  //[4,5,9]  [4,4,8,9,9]
        int j = 0;

        ArrayList<Integer> intersection = new ArrayList<Integer>();
        while (i < nums1.length && j < nums2.length) { //[1,1,2,2] [2,2]
            if (nums1[i] == nums2[j] && !intersection.contains(nums1[i])) {
                intersection.add(nums1[i]);
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index] = num;
            index++;
        }

        return result;
    }
}


