package OopsPlacementAssignment;

import java.util.Scanner;

public class Q2FibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your fibonacci series.");
        int number = sc.nextInt();
        System.out.print(0 + " " + 1 + " ");
        int prev=1;
        int beforePrev=0;
        for (int i = 2; i < number; i++) {
            System.out.print((prev + beforePrev)+" ");
            int temp = beforePrev;
            beforePrev = prev;
            prev = prev + temp;
        }
    }
}
