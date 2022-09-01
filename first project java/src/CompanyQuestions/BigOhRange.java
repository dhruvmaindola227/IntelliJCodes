package CompanyQuestions;

public class BigOhRange {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,100};
        System.out.println(countrange(arr));
    }

    public static int countrange(int[] arr) {
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=(arr[i+1])-1){
                count++;
            }
        }
        return count;
    }
}
