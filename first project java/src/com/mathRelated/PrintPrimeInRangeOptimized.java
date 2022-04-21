package com.mathRelated;
//TIME COMPLEXITY IS O(NLog(LogN))
public class PrintPrimeInRangeOptimized {
    public static void main(String[] args) {
        int num=40;
        boolean[] primes= new boolean[num+1]; //num+1 because num has to be included as well.
        printPrimes(num,primes);
    }

    static void printPrimes(int num, boolean[] primes) {
        for (int i = 2; i * i<=num ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=num; j+=i) {
                    primes[j]=true;
                }
            }
        }

        for (int i=2;i<primes.length;i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
