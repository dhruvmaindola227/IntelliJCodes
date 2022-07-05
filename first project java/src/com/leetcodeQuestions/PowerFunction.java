package com.leetcodeQuestions;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println("leetcode solution -> " + myPow(10,-3));
        System.out.println("my solution -> "+ iterativeMyPow(10 , -3));
    }

        public static double iterativeMyPow(double base , int power){
            double res = 1;
            if (power == 0) {
                return 1;
            }
            if (base == 0 || base == 1 || power == 1) {
                return base;
            }
            if(power > 0){ //power is +ve
                for (int i = 1; i <= power; i++) {
                    res *= base;
                }
            }
            else {
                for (int i = 1; i <= Math.abs(power); i++) {
                    res /= base;
                }
            }

            return res;
        }

        public static double myPow(double x, int n) {
            if (n == 0) {
                return 1;
            }
            if (x == 0 || x == 1 || n == 1) {
                return x;
            }
            if (n < 0) {
                /**
                 * -(n + 1) is done to avoid int overflow.
                 */
                return (1 / x) * myPow(1 / x, -(n + 1));
            }
            return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
        }

}
