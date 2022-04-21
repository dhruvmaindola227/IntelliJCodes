package com.selfPractice;

public class Palindrome {
    public static void main(String[] args) {
        int num=151;
        int rev=0;
        int temp=num;
        while(num>0)
        {
            int last=num%10;
            rev= (rev*10)+last;
            num=num/10;
        }
        if(rev==temp)
            System.out.println("is palindrome");
        else
            System.out.println("isnt a palindrome");

    }
}
