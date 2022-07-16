package com.LambdaExpressions;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 10;
        process(arr , key , wrapperLambda((v,k) -> System.out.println(v * k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i:someNumbers) {
            System.out.println("executing from process");
            consumer.accept(i, key);
            System.out.println("second execution from process");
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda( BiConsumer<Integer,Integer> consumer) {
        return (a, b) -> {
            System.out.println("EXECUTING FROM WRAPPER");
            consumer.accept(a, b);
            System.out.println("SECOND EXECUTION FROM WRAPPER");
        };
    }
}
