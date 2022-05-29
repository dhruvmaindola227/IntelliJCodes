package javaAssignmentMCA;

public class StringToTimeConversion {
    public static void main(String[] args) {
        int number = 23442;
        System.out.println(convertToTimeRatio(number));
    }

    private static String convertToTimeRatio(int number) {
        return (number % 60) == 0 ? ""+number / 60+" hours : "+ 0 + " minutes" : ""+(number / 60)+" hours : "+number % 60 + " minutes";
    }
}
