package com.company.designpattern.factory.dip;


 class DIP {


    public interface IDriver {
        public void drive(ICar car);
    }

    public interface ICar {
        public void run();
    }

    public class Driver implements IDriver {

        @Override
        public void drive(ICar car) {
            car.run();
        }
    }


    public class BMJ implements ICar {
        public void run() {
            System.out.println("宝马汽车开始运行");
        }
    }





}

