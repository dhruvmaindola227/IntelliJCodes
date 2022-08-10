package com.Heap;

import javax.naming.SizeLimitExceededException;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MyHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o2,o1) -> o2 - o1);



        MyHeap heap = new MyHeap();
        heap.insert(20);
        heap.insert(20);
        heap.insert(10);
        heap.insert(9);
        heap.insert(8);
        heap.insert(7);
        heap.insert(6);
        System.out.println("Heap is -> ");
        heap.display();
        for (int i = 0; i < 7; i++) {
            heap.delete();
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(heap.heap , 0 , 7)));
    }

    public int size = 0;
    private final int DEFAULT_SIZE = 20;

    private final int[] heap = new int[DEFAULT_SIZE];

    public void insert(int value) {
        if(size == DEFAULT_SIZE-1){
            System.out.println("OVERFLOW");
            return;
        }
        heap[size] = value;

        int temp = size;
        size++;
        while(true) {
            int parentIndex = (temp - 1) / 2;
            if (heap[temp] > heap[parentIndex]) {
                swap(heap, temp, parentIndex);
                temp = parentIndex;
            } else {
                return;
            }
        }

    }

    public void delete(){
        swap(heap , 0 , size - 1);
        int last = size - 1;
        int i = 0;
        size--;
        while(heap[i] < heap[((2*i) + 1)] || heap[i] < heap[((2*i) + 2)]) {
            int indexOfMaxChild = heap[((2*i) + 1)] > heap[((2*i) + 2)] ? (2*i) + 1 : (2*i) + 2;
            if(indexOfMaxChild < last) {
                swap(heap, i, indexOfMaxChild);
                i = indexOfMaxChild;

            }
            else if(indexOfMaxChild == last){
                return;
            }
            else{
                break;
            }

        }

    }

    public void display(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(heap , 0 , size)));
    }

    private void swap(int[] heap, int start, int end) {
        int temp = heap[end];
        heap[end] = heap[start];
        heap[start] = temp;
    }

}
