package OopsPlacementAssignment;

import java.util.Scanner;

public class Q8PrintNthPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Which prime number do you want to print??");
        int number = new Scanner(System.in).nextInt();
        System.out.println(number+"th prime number is -> " + nthPrimeNum(number));
    }

    public static int nthPrimeNum(int number) {
        int counter = 1;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if(isPrime(i)){
                if(counter == number){
                    return i;
                }
                counter++;
            }
        }
        return -1;

    }

    static boolean isPrime(int num){
        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
