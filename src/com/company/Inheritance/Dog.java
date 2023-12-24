package com.company.Inheritance;

public class Dog extends Animal{

    public Dog(){
        // Simply Constructor
    }
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.eating();
        System.out.println(dog1.color);
    }
}
