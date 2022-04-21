package com.BitManipulation;

public class FindNumberOfSetBits {
    static int counter=0;
    public static void main(String[] args) {
        int num=15;
        printAns(num);
    }
    static void printAns(int num) {
        int lastBit=num & 1;
        if(num==0){
            System.out.println(counter);
            return ;
        }
        if(lastBit==1){
            counter++;
            printAns(num>>1);
        }
        else{
            printAns(num>>1);
        }
    }
}
