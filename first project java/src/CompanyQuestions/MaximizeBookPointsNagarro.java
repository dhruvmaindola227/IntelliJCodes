package CompanyQuestions;

public class MaximizeBookPointsNagarro {
    public static void main(String[] args) {
        System.out.println(maximizePoints(3, 6, new int[]{2, 4 , 6}, new int[]{1 , 3, 4}));

    }

    public static int maximizePoints(int size , int maxDuration , int[] points , int[] bookDuration){
       if(maxDuration == 0 || size == 0){ //base condtion -> smallest valid input.
           return 0;
       }
       if(bookDuration[size - 1] <= maxDuration){ //take max of if we take the (size-1)th book or we dont.

           return Math.max(points[size - 1] + maximizePoints(size - 1 , maxDuration - bookDuration[size - 1] ,
                   points , bookDuration) //take the (size - 1)th element
                   ,
                   maximizePoints(size - 1 , maxDuration , points , bookDuration)); //skip it.
       }
           return maximizePoints(size - 1 , maxDuration , points , bookDuration);
                    //if the bookDuration[i] > current maxDuration then just dont take it.
    }

}
