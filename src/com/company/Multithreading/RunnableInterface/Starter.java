package com.company.Multithreading.RunnableInterface;

import com.company.Multithreading.RunnableInterface.MyThread;
import com.company.Multithreading.RunnableInterface.MyThread2;

public class Starter {
    //Thread 3 which is the main method itself which start both thread and kill after itself
    public static void main(String[] args) {
//        Thread 1
        MyThread t = new MyThread();
        Thread thread = new Thread(t);
        thread.start();

//        Thread2
        MyThread2 t2 = new MyThread2();
        Thread thread2 = new Thread(t2);
        thread2.start();
    }
}
