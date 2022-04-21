package com.leetcodeQuestions;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,5,5,6,6};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;

        while(start<end)
        {
            mid=start+(end-start)/2;
            boolean check_if_half_is_even=(end-mid)%2==0;
            if(nums[mid]==nums[mid+1])
            {
                if(check_if_half_is_even)
                    start=mid+2;
                else end=mid-1;
            }
            else if(nums[mid]==nums[mid-1])
            {
                if(check_if_half_is_even)
                    end=mid-2;
                else start=mid+1;
            }
            else return nums[mid];
        }
        return nums[start];
    }
}
