package RandomTesting;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(1));
    }
    // [0 1 1 2 3 5]

    public static int fibo(int number){
        if(number < 2){
            return number;
        }
        return fibo(number- 1) + fibo(number - 2);
    }
}
