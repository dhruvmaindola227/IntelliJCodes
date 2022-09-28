package com.mathRelated;

public class isPrimeOrNot {
    public static void main(String[] args) {
        int number= 20;
        System.out.println(isPrime(number));
    }
    static boolean isPrime(int num){
        for (int i = 2; i * i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
