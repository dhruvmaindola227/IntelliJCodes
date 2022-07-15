package com.LambdaExpressions;

public class LambdaBasics {
    void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        LambdaBasics lb = new LambdaBasics();
        Greeting aicGreet = new Greeting() {
            @Override
            public void perform() {
                System.out.println("anonymous inner class greet!");
            }
        }; //example of how AIC(Anonymous inner class can be used to pass a behaviour.)

        Greeting lambdaGreet = () -> System.out.println("lambda greet!"); //using lambda expressions

        //lambdas and aic are similar but not same. Concept of lambdas is different although it might look like
        //that it has just been brought to ease the code we write with AICs.

        lb.greet(aicGreet);
        lb.greet(lambdaGreet);

    }

    interface Greeting {
        void perform();
    }
}
