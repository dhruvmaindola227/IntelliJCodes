package RandomTesting;

public class KingGeorgeProblem {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));
    }
}
