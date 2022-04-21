package com.exceptionHandling;

class ExceptionHandling4
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("hy");
            System.out.println("By");

            System.out.println(10/0);
            System.out.println("See you soon");
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
        finally
        {
            System.out.println("finally");
        }
        System.out.println("take care");
    }
}
