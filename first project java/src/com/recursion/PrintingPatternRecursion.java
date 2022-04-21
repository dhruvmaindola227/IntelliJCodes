package com.recursion;

public class PrintingPatternRecursion {
    static int counter=0;
    public static void main(String[] args) {
        printPattern(12);
    }

     static void printPattern(int num) {
        helper(num,num);
    }

     static void helper(int row, int col) {
         counter++;
         if(counter==row+1)
             return ;
         for (int i = 0; i < col; i++) {
             System.out.print("* ");
         }
         System.out.println();
         helper(row,--col);
    }
}
