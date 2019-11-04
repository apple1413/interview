package com.company.observe;

import java.util.Observable;
import java.util.Observer;

public class BaiduSite implements Observer {
    public BaiduSite(Observable o) {

       o.addObserver(this);
    }

    private String newtemper;
    @Override
    public void update(Observable o, Object arg) {
        
        if(o instanceof WeatherNotice){
            WeatherNotice  notic=  (WeatherNotice) o;
            this.newtemper=notic.getTemper();
        }
  
    }
    public  void display(){
        System.out.println(newtemper);
    }
}
