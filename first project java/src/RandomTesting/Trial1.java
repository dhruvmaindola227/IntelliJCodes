package RandomTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Trial1 {
    int x = 10;
Trial1(){
    System.out.println("no arg base");
}
//pradyuman comment

Trial1(int a){
    System.out.println(a + " in parent 1 aerg const");
    System.out.println(" Currently in trial1 and x is -> " + x);
}

    public static void main(String[] args) {
//        Trial2 t2 = new Trial2(2);
//        System.out.println("t2.x -> "+ t2.x);
          int[][] arr = {{1},{2}};
          for(int[] nums : arr){
              System.out.println(Arrays.toString(nums));
          }
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.toString());

    }
}

class Trial2 extends Trial1{
//    int x = 20;
    Trial2(){

    }
    Trial2(int a){
        super(a);
        System.out.println("child 1 arg");
        System.out.println("a -> " + a);
        System.out.println(" Currently in trial2 and x is -> " + x);
    }
}
