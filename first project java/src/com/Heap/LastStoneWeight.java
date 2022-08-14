package com.Heap;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        System.out.println(maxHeap);

        while (maxHeap.size() > 2) {
            int firstStone = maxHeap.poll();
            int secondStone = maxHeap.poll();
            if (secondStone != firstStone) {
                maxHeap.add(secondStone - firstStone);
            }
        } return 0;
    }
}

