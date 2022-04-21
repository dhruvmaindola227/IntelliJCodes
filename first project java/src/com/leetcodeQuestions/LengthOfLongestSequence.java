package com.leetcodeQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSequence {
    public static void main(String[] args) {
        int[] arr= {1,3,2,5,100,4,101,6,5,102,103,104,105,106,107,108};
        //{1,3,2} {1,4,5,6,7,8,2}
        System.out.println(lengthOfLongestSequence(arr));
    }

    public static int lengthOfLongestSequence(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>();
        for(int num : nums) { //storing the array into the HashSet to avoid duplicates.
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {       //traversing the HashSet
            if (!num_set.contains(num-1)) { //via this we want to find the minimum number and then we will keep looking for the
                                            //elements consecutively.
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) { //once it finds the minimum number it will keep looking for the
                                                         // next element. And then next time in the for loop any of the
                                                         //numbers appear they fail the criteria of !nums-set.contains(num-1)
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak); //compare the current streak with max length of sequence.
            }
        }

        return longestStreak;
    }
}


