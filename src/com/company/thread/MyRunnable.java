package com.company.thread;

public class MyRunnable implements Runnable {
    int a=0;
    @Override
    public void run() {
        for(int i=0;i<=20;i++){
            a++;
            System.out.println(a);
        }
    }
    public static void main(String [] args){
        new Thread(new MyRunnable()).start();

    }
}
