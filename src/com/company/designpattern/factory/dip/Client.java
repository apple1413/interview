package com.company.designpattern.factory.dip;

public class Client {

    public static void main(String [] args){
       DIP  dip= new DIP();

        DIP.IDriver driver=   dip.new Driver();;
        DIP.ICar car= dip.new BMJ();
        driver.drive(car);
    }

}
