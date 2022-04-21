package com.recursion;

public class PalindromeWithRecursion {
    private static int last=0;
    private static int rev=0;
    public static void main(String[] args) {
        int num=101;
        checkPal(num);
    }
    static boolean checkPal(int num){
        int temp=num;
        if(num==0)
            if(temp==rev)
                return true;
            else return false;
        last=num%10;
        rev=(rev*10)+last;
        if(temp==rev)
            return true;
        else return checkPal(num/10);

    }
}
