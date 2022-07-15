package com.LambdaExpressions;

import java.util.*;

public class ComparatorWithLambdas {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Dhruv" , 21 , 17),
                new Student("Chirag" , 2 , 17234),
                new Student("Rohan" , 254 , 1234),
                new Student("Rishi" , 2875 , 234324),
                new Student("Raam" , 29 , 987)
        ));
        //Collections.sort() is an overloaded static method in the Collections class.
        //one of it just takes the list and the other one takes an extra thing which is the object of a class
        //that implements the comparator interface and implements the compare() method of the Comparator Interface.
        //So we can either use AIC or we can just pass the behaviour of that AIC in which that method will be present.\
        //using inline lambdas.

        Collections.sort(students , ((o1, o2) -> o1.getHeight() - o2.getHeight())); //sorting based on height
        System.out.println("sorted based on height using lambda " + students);
        System.out.println();

        //can also do
        Collections.sort(students , ((o1, o2) -> o1.getAge() - o2.getAge())); //sorting based on age.
        System.out.println("sorted based on age using lambda " + students);
        System.out.println();

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("sorted based on age using AIC " + students);
        System.out.println();

        //printing the names of Students whose names are starting with R using Stream API.
        students.stream().filter(student -> student.getName().charAt(0) == 'R').forEach(
                student -> System.out.println("Student name starting with R is -> " + student));
        System.out.println();

        //printing the names of Students whose names are starting with R using a multipurpose function
        filterOnBasisOf(students,(student -> student.getName().charAt(0) == 'R'));
        filterOnBasisOf(students , student -> student.getName().charAt(student.getName().length() - 1) == 'g');


        //same as above two but using the AICs.
        filterOnBasisOf(students, new Condition() {
            @Override
            public boolean test(Student student) {
                return student.getName().charAt(0) == 'R';
            }
        });
    }

    public static void filterOnBasisOf(List<Student> students , Condition condition){
        for(Student st : students) {
            if(condition.test(st)){
                System.out.println("Student name filtered using the filterOnBasis() method -> " +  st);
            }
        }
    }
}



interface Condition{
    boolean test(Student student);
}

class Student{
    private String name;
    private int age;
    private int height;

    public Student(){}

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
