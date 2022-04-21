package com.BitManipulation;

public class NoOfDigitsInBaseB {

    public static void main(String[] args) {
        int num=2432;
        int b=2;
        int ans=(int) (Math.log(num)/Math.log(b))+1;
        System.out.println(ans);
    }//complexity is O(logN)

}
