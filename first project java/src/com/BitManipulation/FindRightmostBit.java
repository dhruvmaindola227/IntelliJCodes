package com.BitManipulation;

public class FindRightmostBit {
    static int pos=1;
    public static void main(String[] args) {
        int num=48;
        System.out.println(findPosition(num));
    }
//This is my intuitive solution. May be wrong.
   static int findPosition(int num) {
        int bit=num & 1;
        if(num==0) //edge case.
            return 0;
        if(bit==1) {
            return pos;
        }
        else {
            pos++;
            return findPosition(num >> 1);
        }
    }
}
