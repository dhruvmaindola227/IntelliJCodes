package CompanyQuestions;

public class CardFlipSum {
    public static void main(String[] args) {
        int size = 5;
        int[] cards = {-1,2,3,4,-5};
        int sum = 0;
        for (int card : cards) {
            sum += card;
        }
        //removing and adding the positive version of the minimum sum subarray will give us the maximum sum.
        System.out.println((maxSumPossible(size , cards) * -2) + sum);

    }
    public static int maxSumPossible(int size, int[] cards) {
        //kadanes algorithm to find minimum sum subarray.
        int min_sum = Integer.MAX_VALUE;
        int curr_sum = 0;
        for (int i = 0 ; i < size; i++) {
            curr_sum = curr_sum + cards[i];
            if (curr_sum < min_sum)
                min_sum = curr_sum;
            if (curr_sum > 0)
                curr_sum  = 0;
        }
        return min_sum;
    }
}
