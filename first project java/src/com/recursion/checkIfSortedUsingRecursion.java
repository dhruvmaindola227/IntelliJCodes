package com.recursion;

public class checkIfSortedUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,22,4,2};
        System.out.println(checkSort(arr));
    }

    static boolean checkSort(int[]arr)
    {
        return helper(arr,0);
    }

    static boolean helper(int[] arr,int index){
        if(index<arr.length-1)
        {
            if(arr[index+1]<arr[index])
            {
                return false;
            }
            return helper(arr,index+1);
        }
        return true;
    }
}
