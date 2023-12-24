package com.company.Generic;

public class Box {
    Object container;
    public Box(Object container){
        this.container = container;
    }
    public Object getVal(){
        return this.container;
    }
}
