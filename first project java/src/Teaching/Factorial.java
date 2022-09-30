package Teaching;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }

    public static int printFactorial(int number) {
        if(number == 1){
            return 1;
        }
        return number * printFactorial(number - 1);
    }
}
