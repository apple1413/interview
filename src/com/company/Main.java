package com.company;

import com.sun.org.apache.bcel.internal.ExceptionConstants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;


public class Main {


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        res.add(new ArrayList<Integer>(list));

int s = 1;
//assert s==2;
//assert false;
System.out.println("end");

	// write your code here
//        ExecutorService threadPool=  new ThreadPoolExecutor(2,5,1L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>(3),
//                Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardPolicy());
//        try{
//
//
//        for(int i=1;i<=10;i++){
//
//            threadPool.execute(()->{
//                System.out.println(Thread.currentThread().getName()+"\t 办理业务");
//            });
//        }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
      /*  ArrayList<Integer> list= new ArrayList<>();
        list.add(0,1);
        list.add(0,2);
        list.add(0,3);
        list.add(1,4);
        list.add(1,5);
        list.add(1,6);
        System.out.println(list);*/
        /*
        SynchronousQueue<String>  blockingQueue=new SynchronousQueue<String>();
            new  Thread(()->{
                try{

                    blockingQueue.put("1");
                    blockingQueue.put("2");
                    blockingQueue.put("3");
                }catch(Exception e){
                    e.printStackTrace();
                }


            } ,"AAA").start();*/


   }
}

