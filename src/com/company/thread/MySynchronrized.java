package com.company.thread;

public class MySynchronrized extends Thread {
    static int a=0;
    @Override
    public void run() {
       /* synchronized(this){
            for(int i=0;i<10000;i++){
                a++;
                // System.out.println(a);
            }
        }*/
      method();
    }

  public  static synchronized void method(){
    for(int i=0;i<10000;i++){
        a++;
        // System.out.println(a);
    }
}

    public static void main(String [] args) throws InterruptedException {
        Thread t1=new MySynchronrized();
        Thread t2=new MySynchronrized();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a);


    }
}
