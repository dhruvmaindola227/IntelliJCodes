package CompanyQuestions;

public class KnoldusQuestion4 {
    public static void main(String[] args) {
        int[] arr = {2,0,0,0,0,0,0,2,1,0,2};
        System.out.println(closestEnemy(arr));
    }

    public static int closestEnemy(int[] arr) {
        int indexOfOne = -1;
        //finding the single one that is present.
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                indexOfOne = i;
            }
        }
        //expanding two pointers and whichever finds the '2' first. Difference of that index - firstIndex is the ans.
        int left = indexOfOne;
        int right = indexOfOne;
        int answer = -1;
        while(left >= 0 || right < arr.length){
            if(arr[left] == 2){
                answer = Math.abs(left - indexOfOne);
                break;
            }
            if(arr[right] == 2){
                answer = Math.abs(right - indexOfOne);
                break;
            }
            if(left != 0){
                left--;
            }
            if(right != arr.length - 1)
                right++;
        }
        return answer;
    }
}
