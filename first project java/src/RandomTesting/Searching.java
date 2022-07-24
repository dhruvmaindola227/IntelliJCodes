package RandomTesting;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 70;
        //linear search and binary search
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left < right){
            int middle = left + (right - left)/ 2;
            if(arr[middle] == target){
                System.out.println("Target is found at -> " + middle);
                index = middle;
                break;
            }
            else if(target < arr[middle]){
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        if(index == -1)
            System.out.println("element not found");
    }
}
