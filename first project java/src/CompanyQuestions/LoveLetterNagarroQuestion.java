package CompanyQuestions;

public class LoveLetterNagarroQuestion {
    public static void main(String[] args) {
        System.out.println(checkRotated("adaada", 3));//1
        System.out.println(checkRotated("loHel endFri", 3));//0
        System.out.println(checkRotated("Hello dFrien", 5));//1
    }

    public static int checkRotated(String string , int k) {
        int count = 0;
        String[] inputWords = string.split("\\s+");
        for(String str : inputWords){
            String temp = rotateString(str , k);
            if(temp.equals(str)){
                count++;
            }
        }
        return count;
    }

    public static String rotateString(String str , int k){
        int n = str.length();
        k = (n == 0 ? 0 : k % n);  //k%n is for cases where k>n
        str = reverse(str.toCharArray(), 0    , n - k);
        str = reverse(str.toCharArray(), n - k , n);
        str = reverse(str.toCharArray(), 0 , n);
        return str;
    }

    public static String reverse(char[] str, int l, int r) { //Method made to reverse subarrays.
        while (l < r) {
            char temp = str[l];
            str[l++] = str[--r];
            str[r] = temp;
        }
        return new String(str);
    }

}
