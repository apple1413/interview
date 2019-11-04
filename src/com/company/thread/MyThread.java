package com.company.thread;

public class MyThread extends Thread {

   volatile int a=0;

    @Override
    public void run(){

        for(int i=0;i<=20;i++){
            a++;
            System.out.println(a);
        }

    }
    public static void main(String [] args){
        new MyThread().start();
        new MyThread().start();

    }

}
