package com.company.designpattern.factory.adapter;

public class Voltage220V {

    public int  output(){
        System.out.println("220V");
        int a=220;
        return a;
    };
}
