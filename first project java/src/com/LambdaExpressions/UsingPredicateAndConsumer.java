package com.LambdaExpressions;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingPredicateAndConsumer {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>(Arrays.asList(
                new Student1("Dhruv" , 21 , 17),
                new Student1("Chirag" , 2 , 17234),
                new Student1("Rohan" , 254 , 1234),
                new Student1("Rishi" , 2875 , 234324),
                new Student1("Raam" , 29 , 987)
        ));
        //Consumer<T> represents an operation that accepts a single input argument and returns no result.
        //Predicate<T> represents a predicate (boolean-valued function) of one argument.
        filterOnBasisOf(students , (p -> p.getName().startsWith("R")) , p -> System.out.println("starts with R " + p));
        //filtering students based on names starting with R

        filterOnBasisOf(students , (p -> p.getName().endsWith("g")) , p -> System.out.println("ends with g" + p));
        //filtering students based on names ending with g
    }

    public static void filterOnBasisOf(List<Student1> students , Predicate<Student1> predicate , Consumer<Student1> consumer){
        for(Student1 st : students) {
            if(predicate.test(st)){
                consumer.accept(st);
            }
        }
    }
}
class Student1{
    private String name;
    private int age;
    private int height;

    public Student1(){}

    public Student1(String name, int age, int height) {
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

