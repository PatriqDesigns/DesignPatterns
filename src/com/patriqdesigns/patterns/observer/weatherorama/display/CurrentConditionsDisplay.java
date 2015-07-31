package com.patriqdesigns.patterns.observer.weatherorama.display;

import com.patriqdesigns.patterns.observer.weatherorama.Observable;
import com.patriqdesigns.patterns.observer.weatherorama.Observer;
import com.patriqdesigns.patterns.observer.weatherorama.WeatherData;

/**
 * Created by Andre on 15/07/15.
 */
public class CurrentConditionsDisplay implements Display, Observer {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(Observable observable) {
        if(observable instanceof WeatherData){
            WeatherData data = (WeatherData) observable;
            temperature = data.getTemperature();
            humidity = data.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current temperature "+temperature+" C degrees and humidity "+humidity);
    }
}
