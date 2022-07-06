package RandomTesting;

public class Trial {
    public static void main(String[] args) {
        First_C f = new First_C();
        f.First_C();
        f.myMethod();
    }

}

class First_C {
    public void myMethod(){
        System.out.println("myMethod");
    }
    public void First_C(){
        System.out.println("constructor");
    }
    {
        System.out.println("Instance block");
    }
    static{
        System.out.println("static block");
    }
}
