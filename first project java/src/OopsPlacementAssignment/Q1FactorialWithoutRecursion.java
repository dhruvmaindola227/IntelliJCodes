package OopsPlacementAssignment;

import java.util.Scanner;

public class Q1FactorialWithoutRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of -->>");
        int number = sc.nextInt();
        factorial(number);
    }
    /**Explanation -> //4! = 4 X 3 X 2 X 1.
     * i variable will go directly till whatever the number is , so in this case 4. Then we want to multiply it with 4-1=3. and then 2 and so on
     * till my i becomes 1. Keep in mind that we want to multiply that to the previous product we had attained. i variable will go till
     * 1 obviously because anything * 0 = 0 only.**/
    public static void  factorial(int number) {

        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial*= i;
        }
        System.out.println("Factorial of " + number + " is -> "+ factorial);
    }
}
