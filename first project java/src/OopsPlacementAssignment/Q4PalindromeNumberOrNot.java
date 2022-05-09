package OopsPlacementAssignment;

import java.util.Scanner;

public class Q4PalindromeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your fibonacci series.");
        int number = sc.nextInt();
        int temp = number; //doing this because we are modifying the original number in the code and we need to compare original give number
                            //with its reverse at the end of the code.
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        if(temp == reverse){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome.");
        }
    }
}
