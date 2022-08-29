package RandomTesting;

public class Question {
    public static void main(String[] args) {
        Dhruv nnc = new Dhruv();
        Devanshi nc = new Devanshi();
        nnc.show(); //in child class
        nc.show(); //in child class

    }
}
class Devanshi {
    void show(){
        System.out.println("in parent class");
    }
}
class Dhruv extends Devanshi{
    void show() {
        System.out.println("in child class");
    }
}
