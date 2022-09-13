package OopsPlacementAssignment;

import RandomTesting.ProtectedTrial;

public class ProtectedTrial2 extends ProtectedTrial {

    ProtectedTrial2(int number){
        super(number);
    }

    public static void main(String[] args) {
        ProtectedTrial pt = new ProtectedTrial(2);
//      System.out.println(pt.num); //this will give error now because it is protected.
        ProtectedTrial2 pt2 = new ProtectedTrial2(2);
        System.out.println(pt2.number);
        SubClass sb = new SubClass(2);
        System.out.println(sb.number);
        SubSubClass ssb = new SubSubClass(3);
        System.out.println(ssb.number);
    }
}

class SubClass extends ProtectedTrial2{

    SubClass(int number) {
        super(number);
    }
}

class SubSubClass extends SubClass{

    SubSubClass(int number) {
        super(number);
    }
}
