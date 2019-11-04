package com.company.lock;

import java.util.concurrent.atomic.AtomicReference;

public class UnreenTrantLock {

    private AtomicReference<Thread> ower=new AtomicReference<Thread>();
    private int count=0;
    public void lock(){
        Thread current =Thread.currentThread();
        if(current==ower.get()){
            count++;
            return ;
        }
        while(!ower.compareAndSet(null,current));
    }
    public void unlock(){
        Thread current=Thread.currentThread();
        if(count>0){
            count--;
        }else{
            ower.compareAndSet(current,null);
        }

    }
}
