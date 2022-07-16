package com.LambdaExpressions;

public class Closures {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        processNum(a, new Process() {
            @Override
            public void process(int a) {
//                b = 30; //Variable 'b' is accessed from within inner class, needs to be final or effectively final
                System.out.println(a + b);
            }
        }); //this method is run by the processNum() not main().
            //and since *b* is instantiated in main() it's scope
            //should remain till there only.
            //but it doesnt because the variable isnt getting passed around
            //but its value is.
        //In earlier versions we would have to declare b as final but now we dont. But now we cant change the value of b
        //in the AIC.

        processNum(a , (num) -> System.out.println(num + b));
        //using lambda expression
        //doProcess() is going to execute the print statement and that b in the expression is coming from "closure"
        //whenever there is a lambda expression and its using some variable in that scope , jvm freezses the value of that variable
        //along with the expression. So wherever and whenever the lambda expression is executed the value of b remains same.
        //it might be possible that b's value has changed but for the lambda it will have the same old value.
    }

    private static void processNum(int num , Process process){
        process.process(num);
    }

    interface Process{
        void process(int i);
    }
}
