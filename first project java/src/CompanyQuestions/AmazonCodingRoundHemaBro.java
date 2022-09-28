package CompanyQuestions;

import java.util.Arrays;

public class AmazonCodingRoundHemaBro {
    public static void main(String[] args) {
        int[] stocks = {1,3,2,3};
        System.out.println(minDiff(stocks , stocks.length));
    }

    public static int minDiff(int[] stocks , int size) {
        int currentDiff = 0;
        int minDiff = Integer.MAX_VALUE;
        int currSum = 0;
        int finalIndex = -1;
        int leftAvg = 0;
        int rightAvg = 0;
        int stocksSum = Arrays.stream(stocks).sum();
        int avg = stocksSum / stocks.length;
        for (int i = 0; i < stocks.length; i++) {
            currSum += stocks[i];
            leftAvg = currSum / (i + 1);
            if(i != size - 1) {
                rightAvg = (stocksSum - currSum - stocks[i]) / (size - i - 1);
                currentDiff = Math.abs(leftAvg - rightAvg);
                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    finalIndex = i;
                }
            }
            System.out.println("minDiff "+ minDiff);

        }
        return finalIndex + 1;

    }
}
