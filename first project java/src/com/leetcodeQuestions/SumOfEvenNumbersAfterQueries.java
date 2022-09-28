package com.leetcodeQuestions;

import java.util.Arrays;

public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(new int[] {1,2,3,4} , queries)));
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] finalAnswer = new int[nums.length];
        int[] queryValues = new int[queries.length];
        int[] queryIndices = new int[queries.length];
        int index = 0;
        for(int[] arr : queries){
            queryValues[index] = arr[0];
            queryIndices[index] = arr[1];
            index++;
        }

        int sum = 0;
        for(int num : nums){
            if((num & 1) == 0){
                sum += num;
            }
        }

        //[1,-3,-4,2] queryValues
        //[0,1,0,3]  queryIndices
        //[1,2,3,4] old values
        for(int i = 0 ; i < nums.length ; i++){
            int oldValue = nums[queryIndices[i]];
            nums[queryIndices[i]] += queryValues[i];
            int temp = nums[queryIndices[i]];

            if((temp & 1) == 0){
                sum += temp;
            }
            if((oldValue & 1) == 0) {
                sum -= oldValue;
            }
            finalAnswer[i] = sum;
        }

        return finalAnswer;
    }
}
