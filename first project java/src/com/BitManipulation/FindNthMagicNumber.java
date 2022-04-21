package com.BitManipulation;

public class FindNthMagicNumber {
    static int power_of_5=1;
    static int magicNumber=0;
    public static void main(String[] args) {
        int num=4;
        System.out.println(magicNumber(num));
    }

     static int magicNumber(int num) {
        int right_most_bit=num & 1;
        magicNumber+=right_most_bit*Math.pow(5,power_of_5++);
        if(num==0)
        {
            return magicNumber;
        }else
        return magicNumber(num>>1);

    }
}
