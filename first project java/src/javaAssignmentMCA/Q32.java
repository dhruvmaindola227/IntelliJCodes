package javaAssignmentMCA;

//Write a java program to reverse a string?
public class Q32 {
    public static void main(String[] args) {

        String str = "pointless completely is assignment this ";
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        System.out.println(sb.toString());
    }
}


