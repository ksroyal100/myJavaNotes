package com.company.Multithreading.ProduceConsume;

public class agency {
    int n;
    boolean f = false;
    //f= false: chance : producer
    //f= true: chance: consumer
    public void produce_item(int n) throws Exception
    {
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("Produce: "+ this.n);
        f=true;
        notify();
    }
    public int consume_item() throws Exception
    {
        if(!f){
            wait();
        }
        System.out.println("Consume: "+ this.n);
        f= false;
        notify();
        return this.n;

    }
}
