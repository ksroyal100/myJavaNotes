package com.company.Multithreading.RunnableInterface;

//Type1: using Implements runnable with an abstract built-in run method
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 10; i<20; i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
