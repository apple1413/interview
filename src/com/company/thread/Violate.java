package com.company.thread;

public class Violate  {

    public static volatile int a=0;

    public static  void add(){
        a++;
    }

    public static void main(String [] args) throws InterruptedException {

        Thread[] thread= new Thread[10];

        for(int i=0;i<10;i++){
            thread[i]= new Thread(new Runnable() {
                @Override
                public void run() {
                    add();
                }
            });
            thread[i].start();
        }

        while(Thread.activeCount()>1)
            Thread.yield();
            System.out.println(a);
    }
}
