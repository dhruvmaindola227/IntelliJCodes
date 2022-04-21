package com.exceptionHandling;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
