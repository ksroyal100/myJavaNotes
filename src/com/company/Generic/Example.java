package com.company.Generic;

public class Example {
    public static void main(String[] args) {
        Box box = new Box("bear");
        box.container = 1234;
        System.out.println(box.getVal());
    }
}
