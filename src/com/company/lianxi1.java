package com.company;

import java.util.HashMap;
import java.util.Map;

public class lianxi1 {

    public class Sub extends  Base{
        public  void f(){
            System.out.println("Base");

        }
    }
      public   static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c= Class.forName("com.company.Sub");
      Base b=(Base) c.newInstance();
          System.out.println(  b.getClass().getName());
      System.out.println(  Sub.class.getName());

    byte a=127;
          byte d=1;
          System.out.println( a+d);
    }
}
  class Base{
    public  void f(){
        System.out.println("Base");
    }


}
 class Sub extends  Base{
    public  void f(){
        System.out.println("sub");
    }
}