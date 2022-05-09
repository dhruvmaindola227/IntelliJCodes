package OopsPlacementAssignment;

import java.util.Scanner;

public class Q5IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check if it is prime or not.");
        int number = sc.nextInt();
        if(isPrime(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
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
