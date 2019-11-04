package com.company.designpattern.factory.adapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int  output5V() {
        int a=output()/50;
        return a;
    }
}
