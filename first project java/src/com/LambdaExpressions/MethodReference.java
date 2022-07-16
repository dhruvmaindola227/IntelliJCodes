package com.LambdaExpressions;

public class MethodReference {
    public static void main(String[] args) {
        Thread t = new Thread(() -> println());
        //here we can use method reference.
        //METHOD - REFERENCE
        //We're just referencing to a similar type of method to the task so instead of lamda just reference to that method.
        //here we are referencing a static method so we do className::methodName
        Thread t1 = new Thread(MethodReference::println);
        t.start();
        t1.start();

        //for instance method we write instance::methodName
        //for example for sout we would write System.out::println()
    }

    static void println(){
        System.out.println("Message");
    }
}
