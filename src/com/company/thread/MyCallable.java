package com.company.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable {
    int a=0;
    @Override
    public Object call() throws Exception {
        for(int i=0;i<=20;i++){
            a++;
            //System.out.println(a);
        }

        return a;
    }

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        FutureTask task=  new FutureTask(new MyCallable());
        new Thread(task).start();
      System.out.println(task.get());


    }
}
