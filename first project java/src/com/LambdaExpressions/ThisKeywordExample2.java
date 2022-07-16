package com.LambdaExpressions;

public class ThisKeywordExample2 {
    public static void main(String[] args) {
        int a = 10;
        ThisKeywordExample2 ts = new ThisKeywordExample2();
        ts.execute(a);
    }

    @Override
    public String toString() {
        return "ThisKeywordExample2{}";
    }

    private static void processNum(int num , Process2 process){
        process.process2(num);
    }

    private void execute(int a){
        processNum(a , (num) -> {
            System.out.println(num);
            System.out.println(this);
            //now since the (this) keyword is being used in static context with a lambda expression we see that this keyword
            //with lambdas just refers to the object on which the execute() method is called.
        });
    }

    interface Process2{
        void process2(int i);
    }
}
