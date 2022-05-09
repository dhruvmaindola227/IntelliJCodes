package OopsPlacementAssignment;

import java.util.Scanner;

public class Q2FibonacciSeriesWithRecursion {
    public static int num1 =0, num2 =1, num3 =0;
    //creating global static variables because otherwise we would need to pass it in the arguments in each function call.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your fibonacci series.");
        int number = sc.nextInt();
        int count=10;
        System.out.print(num1+" "+num2);//printing 0 and 1
        printFibonacci(number-2);//number-2 because 2 numbers->(0 & 1) are already printed
    }


    static void printFibonacci(int number){
        if(number>0){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+ num3);
            printFibonacci(number-1);
        }
    }
}
