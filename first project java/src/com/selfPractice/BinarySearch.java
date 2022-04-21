package com.selfPractice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={0,2,5,87,234,345,357,453,463,765,875};
        int target=357;
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
