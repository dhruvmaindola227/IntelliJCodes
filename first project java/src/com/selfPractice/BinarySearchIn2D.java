package com.selfPractice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int target=1;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target)
    {
        int start = 0,row=0;
        int mid=0;
        int end=arr[row].length-1;
        while(start<=end && row<arr.length)
        {
            if (start==end && target!=arr[row][end])
            row++;
            if(target==arr[row][end])
                return new int[]{row,end};
          else if(target>arr[row][end])
              row++;
          else{
              end--;
              mid=start+(end-start)/2;
              if(target==arr[row][mid])
              return new int[]{row,mid};

              else if(target > arr[row][mid])
              {
                  start=mid+1;
              }
              else if(target < arr[row][mid])
              {
                  end=mid-1;
              }}
        }  return new int[]{-1,-1};
    }

}












