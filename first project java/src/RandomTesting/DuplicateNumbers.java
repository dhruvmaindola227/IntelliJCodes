package RandomTesting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {8,3,7,9};
        System.out.println(sortWithoutMovingNegativeOne(arr.length , arr , 3));
    }

    public static int sortWithoutMovingNegativeOne(int N , int[] A , int K) {
        int result = -404;
        int inputArrIndex = -1;
        int outputArrIndex = -1;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == K){
                inputArrIndex = i;
            }
        }
        Arrays.sort(A); //sorting the array

        for (int i = 0; i < A.length; i++) {
            if(A[i] == K){
                outputArrIndex = i;
            }
        }
        result = Math.abs(outputArrIndex - inputArrIndex);
        return result;
    }
}
