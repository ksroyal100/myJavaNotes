package com.company.Abstraction;

abstract public class MyClass {

    //Complete or Concrete Method
    public void cal(){
        System.out.println("calculating results");
    }
    //Abstract method means adhura -> naam yaha body kahi aur
    // Abstract class and method cannot be initiated means we cannot create object of it
    abstract protected void LaunchRocket();
}

class Start{
    public static void main(String[] args){
        // Trick 1 to assign child object to child body
        MyChild child1 = new MyChild();
        child1.LaunchRocket();
        child1.cal();

        //Trick 2 to assign parent object to child body
        MyClass child2 = new MyChild();
        child2.LaunchRocket();
        child2.cal();
    }
}