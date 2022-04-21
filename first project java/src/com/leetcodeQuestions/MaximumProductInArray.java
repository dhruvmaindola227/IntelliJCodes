package com.leetcodeQuestions;

public class MaximumProductInArray {
    public static void main(String[] args) {
    int[] nums={-5,-100,-2,0,2};
    int end=nums.length-1;
        System.out.println(maximumProduct(nums));
    }
   static int maximumProduct(int[] nums) {
        int temp=0;
        int start=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[j-1]>nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
       if(nums[start]<0 && nums[end]==0)
           return 0;
       else if(nums[start]<0 && nums[end]<0)
           return nums[end]*nums[--end]*nums[--end];
       else if(nums[start]<0 && nums[++start]<0 && nums[end]>0)
           return nums[0]*nums[1]*nums[end];
       else if(nums[0]<0 && nums[1]==0)
           return 0;
       else return nums[end]*nums[--end]*nums[--end];
    }
}
