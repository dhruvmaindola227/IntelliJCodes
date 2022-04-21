package com.exceptionHandling;

public class ExceptionHandling5 {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }catch (Exception e)
        {
            throw new ArithmeticException("are you idiot why are you dividin by zero");
        }

    }
}
