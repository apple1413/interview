package com.company.designpattern.factory.factorymethod;

public class BJOrderPizza extends OrderPizza {


    public BJOrderPizza(String orderType){
        super(orderType);
      //  orderType=orderType;
    }

    @Override
    public Pizza createPizza() {
        System.out.println(orderType);
        if(orderType.equals("bjchess")){

           pizza=new  BJChessPizza();
        }
        if(orderType.equals("bjprpper")){

            pizza=new  BJPepperPizza();
        }


        return pizza;
    }
}
