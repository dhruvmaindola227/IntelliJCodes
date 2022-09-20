package RandomTesting;
import java.util.Arrays;

public class InsertAtIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));
        System.out.println(Arrays.toString(insertAtIndex(new int[]{1, 2, 3, 4, 5}, 6, 10)));
    }

    public static int[] insertAtIndex(int[] arr, int pos, int value) {
        int[] newArr = new int[arr.length + 1];
        int first = 0;
        int second = 0;
        if(pos > arr.length){
            newArr[newArr.length - 1] = value;
        } //handling edge case.

        while(first < arr.length && second < newArr.length){
            if(second == pos - 1){
                newArr[second] = value;
                second++;
            }
            newArr[second] = arr[first];
            first++;
            second++;
        }
        return newArr;
    }
}