package com.company.Polymorphism.complieTime;

// this is the class where we create initialize and call object
// remember run time achieve by overloading
// isme hum batate h ki kya hona h
public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Student std1 = new Student();
        std1.read();
        std1.read("Head First Java");
    }

}
