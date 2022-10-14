package CompanyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KnoldusQuestion2 {
    public static void main(String[] args) {
        String[] arr = {"Hema" , "kritika" , "dhruv" , "pradyuman"};
        //                     [4,7,5,9]
        System.out.println(thirdLargestWord(arr));
    }

    public static String thirdLargestWord(String[] words) {
//        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr));
//        words.sort((o1, o2) -> o1.length() - o2.length());
//        return words.get(words.size() - 3);

        //time complexity -> O(NLogN)
        //space complexity -> O(1)




        //time complexity -> O(N)
        //space complexity -> O(N)
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length();
        }
        int answer = -1;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if(i == 3){
                answer = findKthMax(lengths);
                break;
            }
            findKthMax(lengths);
        }
        return words[answer];
    }

    public static int findKthMax(int[] numbers){ //returns the index of the Kth max num
        int max = -1;
        int indexToReturn = -1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
                indexToReturn = i;
            }
        }
        numbers[indexToReturn] = -1;
        return indexToReturn;
    }
 }
