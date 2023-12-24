package com.company.Abstraction;

public interface ShapeInterface {

  abstract public   void calArea(int r);
}

class Square implements ShapeInterface{
    public void calArea(int r){
        System.out.println("Area of Square is " + r * r );
    }
}

class Circle implements ShapeInterface{
    public void calArea(int r){
        System.out.println("Area of Circle is " + (Math.PI * r * r));
    }

    public static void main(String[] args) {
        ShapeInterface s1 = new Circle();
        s1.calArea(2);

        ShapeInterface s2 = new Square();
        s2.calArea(2);
    }
}