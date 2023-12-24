package com.company.Multithreading.RunnableInterface;

//Type1: using Implements runnable with an abstract built-in run method
class MyThread implements Runnable{
    @Override
    public void run() {

        for(int i = 0; i<10; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
//Type2:  Using Extend Thread class method
//public class MyThread extends Thread{
//    MyThread t = new MyThread();
//    t.sta
//}
