package com.SortingAlgorithms;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1,0};
        int target=0;
        System.out.println(searchTarget(arr,target));
    }
    static int searchTarget(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
                else return mid;
            }
            return -1;
        }
     else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
                else return mid;
            }
        }
     return -1;
    }
}
