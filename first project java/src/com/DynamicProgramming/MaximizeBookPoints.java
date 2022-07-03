package com.DynamicProgramming;

public class MaximizeBookPoints {
    public static void main(String[] args) {
//        System.out.println(maximizePoints(3, 7 , new int[]{2,6,9} , new int[]{3,5,3}));
        int a = 10;
        System.out.println();
    }
    public static int maximizePoints(int size , int maxDuration , int[] points , int[] bookDuration){
       if(maxDuration == 0 || size == 0){ //base condtion -> smallest valid input.
           return 0;
       }
       if(bookDuration[size - 1] <= maxDuration){ //take max of if we take the (size-1)th book or we dont.

           return Math.max(points[size - 1] + maximizePoints(size - 1 , maxDuration - bookDuration[size - 1] ,
                   points , bookDuration)
                   ,
                   maximizePoints(size - 1 , maxDuration , points , bookDuration));
       }
           return maximizePoints(size - 1 , maxDuration , points , bookDuration);
                    //if the bookDuration[i] > current maxDuration
    }

}
