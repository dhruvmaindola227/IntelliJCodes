package com.recursion;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BsUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,9,10};
        int target=10;
        int s=0;
        System.out.println((call(arr,target,0,arr.length-1)));
    }

    static int call(int[] arr,int target,int start,int end)
    {
        if(start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        else if(target>arr[mid])
        {
        return call(arr,target,mid+1,end);
        }
        return call(arr,target,start,mid-1);
    }
}
