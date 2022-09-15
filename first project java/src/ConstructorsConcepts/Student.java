package ConstructorsConcepts;

public class Student {
    int rollNumber;
    String name;
    int highestMarks;

    public Student() {
    }

    public Student(int rollNumber, String name, int highestMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.highestMarks = highestMarks;
    }

    void studiesALot(){
        System.out.println("i study a lot");
    }
}
