package RandomTesting;

public class EvenRec {
    public static void main(String[] args) {
        printEven(2, 10);
    }

    public static void printEven(int startingPoint , int limit) {
        System.out.println(startingPoint);
        if (startingPoint == limit){
            return;
        }
        printEven(startingPoint + 2 , limit);
    }
}
