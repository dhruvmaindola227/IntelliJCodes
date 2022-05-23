package javaAssignmentMCA;

public class LongestStringWithoutSpecialCharacters {
    public static void main(String[] args) {
        String string = "fun&!!                  times";
        System.out.println(stringChallenge(string));
    }

    private static String stringChallenge(String string) {
        String answerString = "";
        int length = 0;
        string = string.replaceAll("^[a-zA-z]","");
        String[] arrayOfStrings = string.split("\\s+");
        for (int i = 0; i < arrayOfStrings.length; i++) {
            length = Math.max(length , arrayOfStrings[i].length());
            answerString = arrayOfStrings[i];
        }
        return answerString;
    }
}
