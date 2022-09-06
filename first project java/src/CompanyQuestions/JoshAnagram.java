package CompanyQuestions;

public class JoshAnagram {
    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "baa";
        System.out.println(minSteps(s1 , s2));

    }
    public static int minSteps(String s, String t) {
        // Use a 26-sized array to store the character frequency difference between s and t
        int[] alphabet = new int[26];
        for (int i=0; i<s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        // The sum of alphabet must be 0,
        // we only need to count the absolute sum of either postives or negatives
        int res = 0;
        for (int i : alphabet) {
            if (i > 0) res += i;
        }
        return res;
    }

}
