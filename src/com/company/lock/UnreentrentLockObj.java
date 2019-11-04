package com.company.lock;

public class UnreentrentLockObj {
    UnreenTrantLock lock=  new UnreenTrantLock();

    public void lockFunc(){
        lock.lock();
        System.out.println("lockFunc。。。。");
        lockFunc2();
        lock.unlock();
    }
    public void lockFunc2(){
        lock.lock();
        System.out.println("lockFunc2。。。。");
        lock.unlock();
    }
    public static  void main(String [] args){
        final UnreentrentLockObj obj=new UnreentrentLockObj();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.lockFunc();
            }
        }).start();
    }
}
