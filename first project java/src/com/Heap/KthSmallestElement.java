package com.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Comparator.reverseOrder())); //this is max heap.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //this is min heap by default.
        int[] arr = {1,2,3,3,4,5,5,6,6,6,6,6,6,6};
        System.out.println(findKthLargest(arr , 2));
    }

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }

        return pq.peek();
    }
}
