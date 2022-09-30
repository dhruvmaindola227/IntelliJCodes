package Teaching;

public class PrintHelloWorld {
    public static void main(String[] args) {
        printString(5);
//          printS("asdmks" , 5);
    }

    static void printString(int numberOfTimes){ //base condition.
        System.out.println("Hema");
        if(numberOfTimes == 1){
            return; //base condition
                    //smallest valid input
                    //smallest work we know how to do.
        }
        printString(numberOfTimes - 1);
    }

    static void printS(String name , int n){
        System.out.println(name);
        if (n > 1) {
            printS(name,n - 1);
        }
    }
}
