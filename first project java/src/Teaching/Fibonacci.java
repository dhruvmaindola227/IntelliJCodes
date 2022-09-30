package Teaching;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(60));
    }

    public static int fibo(int num) {
        if(num == 0 || num == 1){
            return num;
        }//base condition.
        return fibo(num - 1) + fibo(num - 2);
    }
}
