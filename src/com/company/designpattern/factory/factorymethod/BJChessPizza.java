package com.company.designpattern.factory.factorymethod;

public class BJChessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("BJChessPizzaprepare");
    }

    @Override
    public void bake() {
        System.out.println("BJChessPizzabake");
    }

    @Override
    public void cut() {
        System.out.println("BJChessPizzacut");
    }

    @Override
    public void box() {
        System.out.println("BJChessPizzabox");
    }
}
