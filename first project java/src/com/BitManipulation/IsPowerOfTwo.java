package com.BitManipulation;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int num=0;
        //num=0 is an exception case.
        boolean ans=(num & (num -1))==0; //kunal solution.
        System.out.println(ans);
        System.out.println(isPowerOf2(num));
    }
    //my solution.
     static boolean isPowerOf2(int num) {
        int lastBit=num & 1;
        if(num==0)
            return false; //exception case/edge case.
        if(lastBit==0)
            return isPowerOf2(num>>1);
        if(lastBit==1 && num>>1!=0)
            return false;

            return true;

    }
}
