package com.company.designpattern.factory.factorymethod;

public class LDChessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("LDChessPizzaprepare");
    }

    @Override
    public void bake() {
        System.out.println("LDChessPizzabake");
    }

    @Override
    public void cut() {
        System.out.println("LDChessPizzacut");
    }

    @Override
    public void box() {
        System.out.println("BLDChessPizzabox");
    }
}
