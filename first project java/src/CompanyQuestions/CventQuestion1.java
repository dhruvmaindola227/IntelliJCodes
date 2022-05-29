package CompanyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CventQuestion1 {
    public static void main(String[] args) {
        int[] numbers = {1234 , 1243 , 6542 , 6742, 2342 , 2345};
        String[] names = {"souvik" , "samarth" , "dhruv" , "rohan" , "aayush" , "ronaldo"};
        int numberToFind = 980;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if(String.valueOf(numbers[i]).contains(String.valueOf(numberToFind))){
                list.add(names[i]);
            }
        }
        if(list.isEmpty()){
            System.out.println("Not found");
        }else{
            Collections.sort(list);
            for(String name : list){
                System.out.print(name + "  ");
            }

        }

    }
}
