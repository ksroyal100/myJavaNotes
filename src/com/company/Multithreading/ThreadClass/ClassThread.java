package com.company.Multithreading.ThreadClass;

public class ClassThread extends Thread{
    public static void main(String[] args) {

        System.out.println(" Starting ");

        //Thread..
        Thread t = Thread.currentThread();
        // getting name of thread
        String tname = t.getName();
        System.out.println("current running thread is " + tname);
        //setting name of thread
        t.setName("Master");
        String tname2 = t.getName();
        System.out.println("current running thread is " + tname2);
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(t.getId());


        System.out.println("Ended");
    }
}
