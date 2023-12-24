package com.company.Multithreading.ProduceConsume;

public class MainPC {
    public static void main(String[] args) {
        agency agy = new agency();
        Producer p = new Producer(agy);
        Consumer c = new Consumer(agy);
        p.start();
        c.start();
    }
}
