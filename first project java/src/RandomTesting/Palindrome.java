package RandomTesting;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String[] words = {"cool","lock","cook"};
        String cool = "bella";
        String lock = "label";
        int[] frequency = new int[26];
        int[] frequency1 = new int[26];
        for (int i = 0; i < cool.length(); i++) {
            frequency[cool.charAt(i) - 'a']+=1;
        }
        for (int i = 0; i < lock.length(); i++) {
            frequency1[lock.charAt(i) - 'a']+=1;
        }

            System.out.println("word-> " + cool + " "+  Arrays.toString(frequency));
             System.out.println("word-> " + cool + " "+  Arrays.toString(frequency1));
            System.out.println("Intersection " + Arrays.toString(intersection(frequency , frequency1)));
        System.out.println((char)(1 + 'a'));
        }


    static  int[] intersection(int[] a, int[] b) {
        int[] t = new int[26];
        for (int i = 0; i < 26; i++) {
            t[i] = Math.min(a[i], b[i]);
        }
        return t;
    }

     static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
        //

    }
}

