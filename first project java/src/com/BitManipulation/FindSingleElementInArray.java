package com.BitManipulation;

public class FindSingleElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,2,1,4,5,3};
        System.out.println(findElement(arr));
    }

    private static int findElement(int[] arr) {
        int unique=0;
        //works because of commutative property of XOR.
        //a ^ 0 = a.
        for (int num:arr) {
            unique^=num;
        }
        return unique;
    }
}
