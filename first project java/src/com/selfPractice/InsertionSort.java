package com.selfPractice;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

       int[] nums={-710,-107,-851,657,-14,-859,278,-182,-749,718,-640,127,-930,-462,694,969,143,309,904,-651,160,451,-159,-316,844,-60,611,-169,-73,721,-902,338,-20,-890,-819,-644,107,404,150,-219,459,-324,-385,-118,-307,993,202,-147,62,-94,-976,-329,689,870,532,-686,371,-850,-186,87,878,989,-822,-350,-948,-412,161,-88,-509,836,-207,-60,771,516,-287,-366,-512,509,904,-459,683,-563,-766,-837,-333,93,893,303,908,532,-206,990,280,826,-13,115,-732,525,-939,-787};
        System.out.println(Arrays.toString(sort(nums)));
    }

    static int[] sort(int[] nums)
    {

        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[j-1]>nums[j])
                {temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;}

            }
        }

        return nums;
    }
}
