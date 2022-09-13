package OopsPlacementAssignment;


import java.util.Scanner;

public class Q7AlternatePrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number till which you want the alternate prime numbers");

//        int number = new Scanner(System.in).nextInt();
//        printAlternatePrimeNumbers(number);
    }

    public static void printAlternatePrimeNumbers(int number) {
        int checkCounter = 0;
        for (int i = 2; i <= number ; i++) {
            if(isPrime(i)){
                if(checkCounter % 2 == 0) {
                    System.out.print(i + " ");
                }
                checkCounter++;
            }
        }

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
