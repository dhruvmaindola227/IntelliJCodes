package Teaching;

public class Recursion {
    public static void main(String[] args) {
//        printHelloWorld(10);
        int number  = 5;
        printCount(number); //arguments
    }

    static void printCount(int number){ //parameters.
        if(number == 0){
            return;
        }
        printCount(number - 1);
        System.out.println(number);

    }

    static void printHelloWorld(int numberOfTimes){
        System.out.println("Hello World");
        if(numberOfTimes == 1){
            return;
        }
        printHelloWorld(numberOfTimes - 1);
    }
}

    //asc  1hema 1kritika 1aayush
    //desc pradyuman 1aakash

