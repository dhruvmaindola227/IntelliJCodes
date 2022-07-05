package com.leetcodeQuestions;

public class CielingOfANumber {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14,16,18,20};
        int target=14;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if(target>=arr[mid])
                start=mid+1;
        }
        return arr[start];
    }

}
