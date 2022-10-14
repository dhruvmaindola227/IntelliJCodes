package CompanyQuestions;

public class KnoldusQuestion3 {
    public static void main(String[] args) {
        int number = 453857;
        System.out.println(largestTwoDigitNumber(number));
    }

    public static int largestTwoDigitNumber(int num) {
        String numInString = String.valueOf(num);
        int max = -1;
        for (int i = 0; i < numInString.length() - 1; i++) {
            int localNum = Integer.parseInt(numInString.substring(i , i + 2));
            max = Math.max(max ,localNum);
        }
        return max;
    }
}
