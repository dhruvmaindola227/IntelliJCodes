package javaAssignmentMCA;

public class LetterChallenge {
    public static void main(String[] args) {
        String s = "asasdafafvzaef";
        System.out.println(letterChallenge(s));
    }

    private static String letterChallenge(String s) {
        String vowels = "AEIOUaeiou";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                char newChar = (char)((s.charAt(i) + 1));
                if(newChar > 'z'){
                    newChar = 'a';
                }
                if(vowels.indexOf(newChar) == -1)
                    ans.append(newChar);
                else
                    ans.append(Character.toUpperCase(newChar));
                }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        }
}
