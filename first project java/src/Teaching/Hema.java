package Teaching;

public class Hema implements Subtraction , Addition  {
    public static void main(String[] args) {
        Subtraction hema = new Hema();
        System.out.println(hema.sub(5,10));
        Addition add = new Hema();
        System.out.println(add.sub(54 , 100));
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


