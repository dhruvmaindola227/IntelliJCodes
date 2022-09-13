package RandomTesting;

public class Functions {
    public static void main(String[] args) {
        int mukesh = 45;
        int suresh = 2234;
        sumOfTwoNums(100 , 10);
        sumOfTwoNums(10L , 20L);
        sumOfTwoNums(10L , 50); //Automatic - Typecasting.
        Human krika = new Human("kr");
    }

    public static void sumOfTwoNums(int karan , int arjun) {
        int sum = karan + arjun;
        System.out.println(sum +" in int function");
    }

    //compile time polymorphism.

    public static void sumOfTwoNums(long karan , long arjun){
        System.out.println(karan + arjun + " in long function");
    }
}
