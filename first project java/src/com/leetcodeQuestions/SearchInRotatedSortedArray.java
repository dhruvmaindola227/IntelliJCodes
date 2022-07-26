package com.leetcodeQuestions;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 1));
    }


    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < nums[end]) { //array is sorted or we could be around pivot.
                if (nums[middle] < target && nums[end] >= target) { //means it is present in this range
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (nums[start] <= target && nums[middle] > target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
