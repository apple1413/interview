package com.company.designpattern.factory.adapter;

public class Phone {

    public void change(Voltage5V voltage5V){
       System.out.println(voltage5V.output5V());
    }
}
