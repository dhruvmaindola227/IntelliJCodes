package com.LambdaExpressions;

public class ThisKeywordExample {
    public static void main(String[] args) {
        int a = 10;
        processNum(a, new Process2() {
            @Override
            public void process1(int i) {
                System.out.println(i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "AIC reference";
            }
        });
        //10 AIC reference because (this) here is referencing to the AIC's object. Thats the reason why we are able to use
        //this keyword in psvm() since otherwise it would say non static things cannot be referred to in a static context.


        processNum(a , (num) -> {
            System.out.println(num);
//            System.out.println(this);
            //com.LambdaExpressions.ThisKeywordExample.this' cannot be referenced from a static context
            //this (this) will give error because for lambdas the "this" keywords value
            //is same as it would be outside the lambda expression which you cant use in psvm().
        });
        ThisKeywordExample2 t = new ThisKeywordExample2();

    }

    private static void processNum(int num , Process2 process){
        process.process1(num);
    }

    private void execute(int a){
        processNum(a , (num) -> {
            System.out.println(num);
            System.out.println(this);
        });
    }


}
interface Process2 {
    void process1(int i);
}

