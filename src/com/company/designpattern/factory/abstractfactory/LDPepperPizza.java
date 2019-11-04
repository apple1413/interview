package com.company.designpattern.factory.abstractfactory;

import com.company.designpattern.factory.factorymethod.Pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("LDPepperPizzaprepare");
    }

    @Override
    public void bake() {
        System.out.println("LDPepperPizzabake");
    }

    @Override
    public void cut() {
        System.out.println("LDPepperPizzacut");
    }

    @Override
    public void box() {
        System.out.println("LDPepperPizzabox");
    }
}
