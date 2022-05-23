package javaAssignmentMCA;

public class StringToTimeConversion {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(convertToTimeRatio(number));
    }

    private static String convertToTimeRatio(int number) {
        return (number % 60) == 0 ? ""+number / 60+" : "+ 0 : ""+(number / 60)+" : "+number % 60;
    }
}
