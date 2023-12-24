package com.company.Generic;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        //Generic list or type safe
        ArrayList <String> lst = new ArrayList<>();
        lst.add("hitesh");
        System.out.println(lst);

        // non-Generic or untype safe method
        ArrayList anlst = new ArrayList();
        anlst.add(124);
        anlst.add("thes");
        System.out.println(anlst);

    }
}
