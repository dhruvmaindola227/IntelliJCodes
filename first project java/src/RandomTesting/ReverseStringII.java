package RandomTesting;

public class ReverseStringII{
    public static void main(String[] args) {
        String s = "abcd";
        int k = 4;
        System.out.println(reverseStr(s , k));
    }

    public static String reverseStr(String s, int k) {
        if(k >= s.length()){ //edge case 1
            return new StringBuilder(s).reverse().toString();
        }
        for (int i = 0; i < s.length(); i+=2 * k) {
            s = reverseBetween(s, i , Math.min(s.length() , i + (k - 1)));
        }
        return s;
    }


    public static String reverseBetween(String s , int start , int end){
        char[] arr = s.toCharArray();
        while(start <= end){ //swapping characters one by one.
            char ch = arr[end];
            arr[end] = arr[start];
            arr[start] = ch;
            start++;
            end--;
        }
        return new String(arr);
    }

}
