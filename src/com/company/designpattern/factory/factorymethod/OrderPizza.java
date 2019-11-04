package com.company.designpattern.factory.factorymethod;

public abstract class OrderPizza  {
    public abstract  Pizza createPizza();
    protected String orderType;
    Pizza pizza=null;
    public OrderPizza(String orderType){
        this.orderType=orderType;
        pizza=createPizza();
        pizza.prepare();
        pizza.box();
        pizza.bake();
        pizza.cut();
    }

}
