package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] pileOfBananas = {3,7,11,6};
        int timeLimit = 8;
        System.out.println(minKValue(pileOfBananas , timeLimit));
    }
    public static int minKValue(int[] pileOfBananas , int timeLimit) {
        //initializing the two pointers.
        int left = 1;
        int right = Arrays.stream(pileOfBananas).max().orElse(1);

        while(left < right) {
            int hoursSpent = 0;
            int middle = left + (right - left) / 2;
            for(int banana : pileOfBananas){
                hoursSpent += Math.ceil((double) banana / middle);
            }
            if(hoursSpent <= timeLimit)
                right = middle;
            else
                left = middle + 1;
        }
        return right;
    }
}
