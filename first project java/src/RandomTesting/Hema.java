package RandomTesting;

import java.sql.SQLOutput;

public class Hema {
    public static void main(String[] args) {
        Human kritika = new Human("kritika" , 50 , 165 , 3425244,true);
        Human hema = new Human("hema" , 100 , 163 , 234324,true);
        Human dhruv = new Human("dhruv");

    }
}

class Human {
    Human(String name , int weight , int height , int netWorth , boolean hasLongHair){
        this.weight = weight;
        this.name = name;
        this.height = height;
        this.netWorth = netWorth;
        this.hasLongHair = hasLongHair;
    }

    Human(String name){
        this.name = name;
        System.out.println("cons. called");
    }

    Human(){
        System.out.println("called");
    }


    public static int worldPopulation;
    int weight; //0
    int height;
    String name;
    void see(){
        System.out.println("human is seeing");
    }
    int netWorth;
    boolean hasLongHair;

}


