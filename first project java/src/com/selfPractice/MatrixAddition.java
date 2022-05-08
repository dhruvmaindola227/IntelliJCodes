package com.selfPractice;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] res = new int[3][3];
        System.out.println("Enter values for matrix 1\n");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length ; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("mat1\n");
        for (int i = 0; i < mat1.length; i++) {
            System.out.println();
            for (int j = 0; j < mat1.length ; j++) {
                System.out.print(mat1[i][j]+" ");
            }
        }
        System.out.println("Enter values for matrix 2\n");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length ; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("mat1 \n");
        for (int i = 0; i < mat2.length; i++) {
            System.out.println();
            for (int j = 0; j < mat2.length ; j++) {
                System.out.print(mat2[i][j]+" ");
            }
        }
        System.out.println("result matrix is\n");

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length ; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println();
            for (int j = 0; j < res.length ; j++) {
                System.out.print(res[i][j]+" ");
            }
        }



    }
}
