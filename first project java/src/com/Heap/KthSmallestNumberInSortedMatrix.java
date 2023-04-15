package com.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumberInSortedMatrix {
    public static void main(String[] args) {
//        int[][] arr = {{1,5,9},{10,11,13},{12,13,15}};
        int[][] arr = {{1,2},{1,3}};
        System.out.println(kthSmallest(arr , 1));
    }

    public static int kthSmallest(int[][] arr , int k) {
        if(arr[0].length == 1){
            return arr[0][0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int[] nums = new int[arr.length * arr[0].length];
        int sizeOfEach = 0;
        for(int[] array : arr){
            sizeOfEach = array.length;
            break;
        }
        int counter = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                nums[counter++] = anInt;
            }
        }
        for (int index = Math.abs(sizeOfEach - k - 1); index < k ; index++) {
            System.out.println("index = " + index);
            maxHeap.add(nums[index]);
            System.out.println(maxHeap);
            if(maxHeap.size() > Math.abs(k - sizeOfEach) ){
                maxHeap.poll();
            }
        }

        return maxHeap.poll();
    }
}
