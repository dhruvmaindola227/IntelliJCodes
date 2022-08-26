package com.BitManipulation;

public class FindSingleElementInArray {
    public static void main(String[] args) {
        int[] arr = {9,3,9,3,9,7,9,7,7};
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
