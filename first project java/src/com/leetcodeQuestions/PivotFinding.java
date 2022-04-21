package com.leetcodeQuestions;

public class PivotFinding {
    public static void main(String[] args) {
    int [] nums={4,5,1,2,3};
        System.out.println(findMin(nums));
    }

   static int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int val=0;
        if(end==0)
            return nums[0];
       if(nums[start]<nums[end])
           return nums[0];
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {val=mid+1;
            break;}
            else if(nums[start]>nums[mid])
                end=mid-1;
            else if(nums[start]<nums[mid] && nums[mid+1]>nums[mid])
                start=mid+1;

        } val=nums[0];
        return nums[val];
    }
}
