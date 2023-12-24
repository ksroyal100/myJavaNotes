package com.company.classobject;

public class Objects {
    public static void main(String[] args){

        //now creating object of Student of Student Class
        //new keyword used to allocate dynamic memory in java for an object
        Student str1 = new Student();
        // Constructor is used to initialize an object
        // Here Student() is default constructor or non-parameterized constructor
        //now a byDefault Constructor created automatically for Object
        // Constructor does not return any value

        //assigning values to object
        str1.StudentId = 101;
        str1.StudentName = "Ram";
        str1.StudentCity = "Mumbai";

        // applying methods or functions to objects
        str1.study();
        str1.showFullDetails();


        //now creating object of Student
        Student str2 = new Student(102, "Shyam", "Banglore" );
        // passing values by parametrized constructor

//        Student str2 = new Student();

        //assigning values to object : type 1 basic type
//        str2.StudentId = 102;
//        str2.StudentName = "Shyam";
//        str2.StudentCity = "Banglore";

        // applying methods or functions to objects

        str2.study();
        str2.showFullDetails();


    }
}
