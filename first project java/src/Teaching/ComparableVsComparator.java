package Teaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableVsComparator {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>(Arrays.asList(
                new Student("Dhruv" , 22 , 24432),
                new Student("Devanshi" , 21 , 34),
                new Student("Chirag" , 20 , 33)
        ));
        System.out.println(listOfStudents);
        Collections.sort(listOfStudents , ((o1, o2) -> o1.rollno - o2.rollno));
        System.out.println(listOfStudents);
    }
}

class Student {
    String name;
    int age;
    int rollno;

    public Student(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return " [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
    }
}