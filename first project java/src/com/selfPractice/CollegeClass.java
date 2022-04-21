package com.selfPractice;

import java.util.Scanner;

public class CollegeClass {
    public static void main(String[] args) {
//     Student s1=new Student();
//     Student s2= new Student();
//    s1.readVal("Mukesh","Bca",20);
//    s2.readVal("Suresh","MCA",21);
//     s1.showVal();
//     s2.showVal();
     int a=-4;
     int b=-4;
     int sum=a+b;
        System.out.println(sum);
    }

    public static class Student {
        String name;
        String Course;
        int Age;

        void readVal(String sname, String course, int age)
        {
            this.name=sname;
            this.Course=course;
            this.Age=age;
        }

        void showVal()
        {
            System.out.println(name);
            System.out.println(Course);
            System.out.println(Age);
            }

    }
}
