package ConstructorsConcepts;

public class ChildClass extends ParentClass{
    int childProperty;
    ChildClass(){
        System.out.println("In no argument constructor of ChildClass");
    }

    ChildClass(int number){
        System.out.println("In ONE argument constructor of ChildClass");
        this.childProperty = number;
    }
}
