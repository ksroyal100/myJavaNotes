package com.company.Multithreading.ProduceConsume;

public class Producer extends Thread{
    agency a;
    Producer(agency a){
        this.a = a;
    }

    @Override
    public void run() {
        int i = 1;
        while (true){
            try {
                this.a.produce_item(i);
            } catch (Exception e) {

            }
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
            i++;
        }
    }
}
