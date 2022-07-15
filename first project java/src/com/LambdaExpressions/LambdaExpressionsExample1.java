package com.LambdaExpressions;

public class LambdaExpressionsExample1 {

    public static void main(String[] args) {
        //dont even need to give type of a,b because it will check that from the interface itself.
        DoubleTheNumber nums = (a , b) -> a * b; //this is telling the compiler the behaviour of the function multiplyBoth()
        System.out.println(nums.multiplyBoth(100,3));
    }

    interface DoubleTheNumber{
        int multiplyBoth(int number1 , int number2);
    }
}
