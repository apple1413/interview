package com.company.designpattern.factory.adapter;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Client {

    public static  void main (String [] args){

        List<String> list=Collections.synchronizedList(new ArrayList<>());
        for(int i=1;i<=30;i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }).start();
            System.out.println( String.valueOf(i));
        }
        /**
         * 1.故障现象
         *   java.util.conurrentModificationExceptiob
         * 2.导致原因
         *
         *3.解决方案
         *  3.1 new Vector<>();
         *  3.2 Collections.synchronizedLList(new ArrayList<><>());
         *  3.3 ???
         * 4.优化建议
         *
         *
         */
        new CopyOnWriteArrayList<>();


        //Phone phone = new Phone();
        //VoltageAdapter voltageAdapterv= new VoltageAdapter();
        //phone.change(voltageAdapterv);
    }






}
