package RandomTesting;

public class Trial implements If1,If2 {
    @Override
    public void m1() {
        System.out.println("method called");
    }

    public static void main(String[] args) {
       If1 i = new Trial();
       i.m1();
    }

}

interface If1{
    void m1();
}

interface If2{
    void m1();
}
