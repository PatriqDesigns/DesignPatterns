package com.patriqdesigns.patterns.observer.weatherorama.display;

import com.patriqdesigns.patterns.observer.weatherorama.Observable;
import com.patriqdesigns.patterns.observer.weatherorama.Observer;
import com.patriqdesigns.patterns.observer.weatherorama.WeatherData;

/**
 * Created by Andre on 15/07/15.
 */
public class ForecastDisplay implements Display, Observer {

    @Override
    public void update(Observable observable) {
        if(observable instanceof WeatherData){
            WeatherData data = (WeatherData) observable;

        }
    }

    @Override
    public void display() {

    }
}
