package com.company.Multithreading.ProduceConsume;

public class Consumer extends Thread{
    agency a;
    Consumer(agency a){
        this.a = a;
    }

    @Override
    public void run() {
        while (true){
            try {
                this.a.consume_item();
            } catch (Exception e) {
            }
            try {
                Thread.sleep(3000);
            }catch (Exception e){}
        }
    }
}
