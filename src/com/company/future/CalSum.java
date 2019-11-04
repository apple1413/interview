package com.company.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CalSum {
    public  static class UserCallable implements Callable<Integer>{
        private int sum=0;
        @Override
        public Integer call() throws Exception {
            for(int i=0;i<5000;i++){
                sum=sum+i;
            }
            return sum;
        }
    }
    public static  void main(String[] args) throws ExecutionException, InterruptedException {
        UserCallable callable= new UserCallable();
        FutureTask task=new FutureTask<Integer>(callable);
        Thread thread =new Thread(task);
        thread.start();
        System.out.println(task.get());
    }
}
