package Teaching;

public class Hema implements Subtraction , Addition  {
    public static void main(String[] args) {
        Subtraction hema = (a,b) -> b-a;
        Addition chirag = (a,b) -> a-b;
        System.out.println(hema.sub(5,10));
        System.out.println(chirag.sub(5,10));
    }

    @Override
    public int sub(int a, int b) {
        return b - a;
    }
}

interface Subtraction{
    int sub(int a , int b);
}

interface Addition{
    int sub(int a , int b);
}


