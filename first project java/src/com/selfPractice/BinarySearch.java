package com.selfPractice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1};
        //[1,2,3,4,5,6,7]
        int target=3;
        System.out.println(searchTarget(arr,target));
    }

    static int searchTarget(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
           int mid=start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else return mid;
        }
        return -1;
    }
}
