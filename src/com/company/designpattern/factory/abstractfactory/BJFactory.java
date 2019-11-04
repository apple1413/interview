//package com.company.designpattern.factory.abstractfactory;
//
//public class BJFactory implements  AbsFactory{
//
//    @Override
//    public Pizza createPizza(String orderType) {
//        System.out.println("~使用的是抽象工厂模式~");
//        Pizza pizza = null;
//        if (orderType.equals("cheese")) {
//            pizza = new BJChessPizza();
//        } else if (orderType.equals("pepper")) {
//            pizza = new BJPepperPizza();
//        }
//        return pizza;
//    }
//    }
//}
