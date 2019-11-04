package com.company.designpattern.factory.abstractfactory;


import com.company.designpattern.factory.abstractfactory.Pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("BJPepperPizzaprepare");
    }

    @Override
    public void bake() {
        System.out.println("BJPepperPizzabake");
    }

    @Override
    public void cut() {
        System.out.println("BJPepperPizzacut");
    }

    @Override
    public void box() {
        System.out.println("BJPepperPizzabox");
    }
}
