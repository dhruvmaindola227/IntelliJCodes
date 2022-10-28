package Teaching;

import com.sun.security.jgss.GSSUtil;

public class ClassReference {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
    }
}

class Animal{
    public void makeNoise(){
        System.out.println("generic noise");
    }
}

class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Bhow bhow!!");
    }

    public boolean hasFourLegs(){
        return true;
    }
}


