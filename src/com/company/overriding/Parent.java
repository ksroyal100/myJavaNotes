package com.company.overriding;

public class Parent {
    //Overridden method
    protected void m1() {
        System.out.println("I'm m1() of parent");
    }

}
// Precedence of class type
// public > protected > default > private

class Child extends Parent{

    // overriding method of it's parent's method
    //always put higher precedence of class type for
    //overriding the method
    //Co-variant like - void , String etc return types are allow
    public void m1(){
        System.out.println("I'm m1() of child");
    }
}