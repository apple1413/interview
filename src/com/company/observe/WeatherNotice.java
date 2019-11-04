package com.company.observe;

import java.util.Observable;

public class WeatherNotice extends Observable {

    private String temper;

    public void setTemper(String temper) {
        this.temper = temper;
        setChanged();
        super.notifyObservers(temper);
    }

    public String getTemper() {
        return temper;
    }

    public WeatherNotice(String temper) {
        this.temper = temper;

    }
}
