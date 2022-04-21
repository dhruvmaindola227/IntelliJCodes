package com.leetcodeQuestions;

public class EvenNumbers {
    public static void main(String[] args) {

        int [] arr={12,523,4245,5346,3,656,3463,3425};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            String s=Integer.toString(num);
            int len=s.length();
            if(len%2==0)
                count++;
        }
        System.out.println("Number of even digits is "+ count);
    }

    }


