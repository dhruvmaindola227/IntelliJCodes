package com.BitManipulation;

public class IsOddOrEven {
    public static void main(String[] args) {
        int num=14;
        System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num) {
    //if lsb is 1 then number is odd , else even.
    // a & 1= a.
        return (num&1)==1;
    }
}
