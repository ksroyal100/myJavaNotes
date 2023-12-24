package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Implicit data type isme automatic or jvm se type casting hoti hai

        int par = 34;
        System.out.println(par);

        double parcahnge = par;
        System.out.println(parcahnge);

        // Explicit Data Type isme programmer forcely data typ casting karata hai
        double val = 34.324;
        System.out.println(val);

        int valchange = (int)val;
        System.out.println(valchange);

        // for-each loop traversing loop
        int  nums[] = {12, 13, 45, 56};
        for(int x : nums){
            System.out.println(x);
        }
    }
}
