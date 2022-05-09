package OopsPlacementAssignment;

import java.util.Scanner;

public class Q1FactorialWithoutRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of -->>");
        int number = sc.nextInt();
        factorial(number);
    }

    public static void  factorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial*= i;
        }
        System.out.println("Factorial of " + number + " is -> "+ factorial);
    }
}
