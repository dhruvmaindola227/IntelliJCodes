package OopsPlacementAssignment;

import java.util.Scanner;
//EXPLANATION
/**4! = 4 X 3 X 2 X 1
 * Think of it this way.... Any number factorial is basically that number multiplied by the factorial of the previous number.
 * if i say find the factorial of 6. it is 6x5x4x3x2x1 right? And now if i say find factorial of 5. It is 5x4x3x2x1.
 * Notice how 6 factorial has all of the elements of 5 factorial and the only difference is that 6 is being multiplied to
 * whatever the value of 5 factorial is. This is the same for every number. Even for 1. (0! = 1).**/
public class Q2FactorialWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of -->>");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
//take the number and multiply it with the factorial of the previous number.
// Aur previous number ka factorial = previous number x previous number ka bhi previous number
//aise chalta rahega jabtak previous number 1 nahi banjaata.
//jab hoga 1 toh hum 1 return kardenge aur aise karke saare ek ek karke multiply hote jaynge.
    public static int factorial(int number) {
        if(number == 1){
            return 1;
        }
       return number * factorial(number-1);

    }
}
