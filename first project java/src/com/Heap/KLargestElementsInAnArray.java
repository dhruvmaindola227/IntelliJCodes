package com.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {7,3,2,10,0,20,1,15,40};
        System.out.println(Arrays.toString(kLargestElements(arr , 3)));
    }

    private static int[] kLargestElements(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2) -> o2 - o1);
        for(int num : arr)
            maxHeap.add(num);
        int[] answer = new int[k];
        for (int i = 0; i < k; i++)
            answer[i] = maxHeap.poll();
        return answer;
    }
}
