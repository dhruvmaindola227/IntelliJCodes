package CompanyQuestions;

import java.util.Arrays;

public class SumOfArraysReversed {
    public static void main(String[] args) {
        int[] arr = {2,4,7,2};
        System.out.println(Arrays.toString(sumOfArrayReversed(arr)));
    }

    public static int[] sumOfArrayReversed(int[] arr) {
        int[] ans = new int[arr.length];
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num);
        }
        int num = Integer.parseInt(sb.toString());
        int reverseNum = Integer.parseInt(sb.reverse().toString());
        int sum = num + reverseNum;
        String temp = String.valueOf(sum);
        System.out.println("temp " + temp);
        for (int i = 0; i < temp.length(); i++) {
            System.out.println(sb.charAt(i));
            ans[i] =  Integer.parseInt(Character.toString(temp.charAt(i)));
        }
        return ans;

    }
}
