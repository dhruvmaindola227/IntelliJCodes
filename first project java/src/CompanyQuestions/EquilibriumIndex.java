package CompanyQuestions;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.println("The equilibrium Index is -> " + equilibriumIndex(arr));
    }

    public static int equilibriumIndex(int[] arr) {
        int[] leftSum = new int[arr.length];
        int lSum = 0;
        int[] rightSum = new int[arr.length];
        int rSum = 0;
        //adding the sum from left to right.
        for(int i = 0 ; i < arr.length ; i++){
            lSum += arr[i];
            leftSum[i] = lSum;
        }
        //adding the sum from right to left.
        for(int i = arr.length - 1 ; i > -1 ; i--){
            rSum += arr[i];
            rightSum[i] = rSum;
        }
        boolean ans = false;
        for (int i = 0; i < arr.length; i++) {
            //edge case number 1
            if(i == 0){
                lSum = 0;
                rSum = rightSum[i + 1];
                ans = lSum == rSum;

            }
            //edge case number 2
             if(i == arr.length - 1){
                rSum = 0;
                lSum = leftSum[i - 1];
                ans = lSum == rSum;
            }

             if(i != 0 && i != arr.length - 1){
                 lSum = leftSum[i - 1];
                 rSum = rightSum[i + 1];
                 ans = lSum == rSum;
             }

            if(ans){
                return i;
            }

        }
        return -1;
    }
}
