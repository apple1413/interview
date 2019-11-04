package com.company;

public class DeadLockDemo {

    public static class MyRunnable implements Runnable{
       private String lockA;
       private String lockB;

       MyRunnable(String lockA,String lockB){
           this.lockA=lockA;
           this.lockB=lockB;
       }

        @Override
        public void run() {

            synchronized (lockA){
                System.out.println(Thread.currentThread().getName()+"\t自动持有："+lockA+"尝试获取"+lockB);
                synchronized (lockB){
                    System.out.println(Thread.currentThread().getName()+"\t自动持有："+lockB+"尝试获取"+lockA);
                }
            }
        }
    }
    public static void main(String [] args) {
        String lockA="lockA";
        String lockB="lockB";
        new Thread(new MyRunnable(lockA,lockB),"AAA").start();
        new Thread(new MyRunnable(lockB,lockA),"BBB").start();
    }
}
