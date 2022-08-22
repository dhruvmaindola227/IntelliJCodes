package RandomTesting;

public class TypeCasting {

    public static void callMe(){
        System.out.println("cm");
    }

    public static void main(String[] args) {
        String s = "dasd";
        Object o = (Object) s;
        System.out.println(s == o);
    }
}

class newClass extends TypeCasting{
    public static void callMe(){
        TypeCasting.callMe();
    }
}