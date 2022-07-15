package com.exceptionHandling;

public class ExceptionHandling8 { //1  //We have delegated the responsibility to main to throw the exception to jvm
    public static void main(String[] args) throws InterruptedException {
        doStuff();
    }
    public static void doStuff()     //3   //Even if we write throws for doMoreStuff but not here
                                             //then here the CE will be there.
    {
        doMoreStuff();

    }
    public static void doMoreStuff()  //2   //but not throwing it till the main method.
    {
        throw new ArithmeticException();
    }
}

class NewClass{
   static void hello(){
       System.out.println("hello");
    }

}
