package com.recursion;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=44;
        System.out.println(findN(arr,target,0));
        System.out.println(find(arr,3,0));
    }

   static int find(int[] arr,int target, int index){
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
            return index;
        else return find(arr,target,index+1);
   }

   static boolean findN(int[] arr,int target,int index){
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || findN(arr,target,index+1);
   }
}
