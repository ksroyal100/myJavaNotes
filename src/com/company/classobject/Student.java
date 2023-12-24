package com.company.classobject;

public class Student {

    //data : data members : instance variables
    int StudentId;
    String StudentCity;
    String StudentName;

    //Here we provide a constructor for Object Class's Object : non-parameterized
    public Student() {
        System.out.println("Initializing the object");
    }

    //We can perform constructor overloading by creating multiple constructor for object
    // here i can use str2 to perform
    //assigning values to object : type 2

    // let create a situation where instance var is same as constructor var
    public Student(int id, String StudentName, String StudentCity){
        System.out.println("parameterized constructor");
        StudentId = id;
        // Understanding this keyword
        // 1. Refer to current invoking object
        // 2. this()-> for calling current class constructor
        // from inside different constructor of same class
        //here we use this keyword to differentiate both var
        this.StudentName = StudentName;
        this.StudentCity = StudentCity;
    }

    //Behavior : members methods : function used for method
    public void study(){
        System.out.println(StudentName + " is studying");
    }
    public void showFullDetails(){
        System.out.println("My name is " + StudentName);
        System.out.println("My id is " + StudentId);
        System.out.println("My Ciy name is " + StudentCity);
    }

}
