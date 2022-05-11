package OopsPlacementAssignment;
import java.util.Arrays;
import java.util.Scanner;

public class Q6PrintPrimeInRange {
    public static void main(String[] args) {
        System.out.println("Enter the range number 1");
        int range1 = new Scanner(System.in).nextInt();
        System.out.println("Enter the range number 2");
        int range2 = new Scanner(System.in).nextInt();
//        printPrimeInRangeNaive(range1 , range2);
        printPrimeInRangeOptimal(range1 , range2);
    }

    public static void printPrimeInRangeOptimal(int range1, int range2) {
        boolean[] isPrime = new boolean[range2+1];
        helper(range1 , range2 , isPrime);
    }

    public static void helper(int range1, int range2, boolean[] isPrime) {
        /**initially boolean array isPrime is going to be all false.
        we are assuming that if the ith element in the isPrime array
        is false , that means it is a prime number.
        /**TIME COMPLEXITY IS O(NLog(LogN))**/


        //starting from 2 , we will set all the factors of 2 in the isPrime array as true.
        // will do that for every number. by doing this we massively decrease the number of
        //checks.
        for (int i = 2; i < isPrime.length ; i++) {
            if(!isPrime[i]) {
                for (int j = i*2; j < isPrime.length; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
        for (int i = range1; i < isPrime.length; i++) {
            if(!isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printPrimeInRangeNaive(int range1, int range2) {
        /**brute force approach
        //calling the isPrime function for every single number in the range.
        //isPrime() works at O(sqrt(n)) and for each number we are calling that , so the overall complexity is O(n*sqrt(n))**/
        for (int i = range1; i <= range2; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
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
