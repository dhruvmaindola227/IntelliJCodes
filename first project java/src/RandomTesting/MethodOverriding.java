package RandomTesting;

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println(createString(new char[]{'a' , 'b'}));
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String createString(char[] chars){
        StringBuilder s = new StringBuilder();
        for(char ch : chars){
            s.append(ch);
        }
        return s.toString();
    }
}