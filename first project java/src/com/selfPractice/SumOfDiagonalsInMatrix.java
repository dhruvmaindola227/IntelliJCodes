package com.selfPractice;

import java.util.Scanner;

public class SumOfDiagonalsInMatrix {
    public static void main(String[] args) {
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array , has to be N X N");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("enter the elements inside the array.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the array is");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    leftSum += matrix[i][j];
                }
                 if(j == matrix[i].length - 1 - i){
                    rightSum +=matrix[i][j];
                }
            }
        }

        if(size % 2 ==0)
            sum = leftSum + rightSum;
        else
            sum = leftSum + rightSum - matrix[size/2][size/2];
        System.out.println("Sum of the left diagonals is "+ leftSum);
        System.out.println("sum of the right diagonals is "+ rightSum);
        System.out.println("sum of all left and right diagonals is "+  sum);
    }
}
