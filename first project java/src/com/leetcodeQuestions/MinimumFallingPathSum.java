package com.leetcodeQuestions;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
     int[][] matrix = {{100,-42,-46,-41},{31,97,10,-10},{-58,-51,82,89},{51,81,69,-51}};
        System.out.println(minFallingPathSum(matrix));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int sum = Arrays.stream(matrix[0]).min().orElse(0);
        for (int i = 0; i < matrix.length; i++) {
             int minPos = findMinPos(matrix , i);
             if(minPos == 0){
                 sum += Math.min(matrix[i+1][minPos] , matrix[i+1][minPos + 1]);
             }else if(minPos == matrix[i].length - 1){
                 sum += Math.min(matrix[i+1][minPos] , matrix[i+1][minPos - 1]);
             }else{
                 sum += Math.min(Math.min(matrix[i+1][minPos] , matrix[i+1][minPos + 1]),matrix[i+1][minPos - 1]);
             }
        }
        return sum;
    }

    public static int findMinPos(int[][] matrix , int row){
        int min = Integer.MAX_VALUE;
        int minPos = -1;
        for (int i = 0; i < matrix[row].length; i++) {
            if(matrix[row][i] < min){
                min = matrix[row][i];
                minPos = i;
            }
        }
        return minPos;
    }
}
