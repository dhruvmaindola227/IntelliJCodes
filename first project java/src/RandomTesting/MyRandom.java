package RandomTesting;

import java.util.ArrayList;
import java.util.Arrays;

public class MyRandom  {
    public static void main(String[] args) {
        RandomTest rt = new RandomTest(2);
        RandomTest rt1 = rt;
        rt1.property = 100;
        System.out.println(rt == rt1);
        System.out.println(rt.property);

    }
}


class RandomTest{
    int property;

    public RandomTest() {
    }

    public RandomTest(int property) {
        this.property = property;
    }
}





