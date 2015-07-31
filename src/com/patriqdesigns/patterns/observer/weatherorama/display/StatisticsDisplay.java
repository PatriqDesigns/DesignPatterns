package com.patriqdesigns.patterns.observer.weatherorama.display;

import com.patriqdesigns.patterns.observer.weatherorama.Observable;
import com.patriqdesigns.patterns.observer.weatherorama.Observer;
import com.patriqdesigns.patterns.observer.weatherorama.WeatherData;

/**
 * Created by Andre on 15/07/15.
 */
public class StatisticsDisplay implements Display, Observer {

    private float temperaturesChangesSum;
    private float changesCount;

    private boolean checkedTemperature;
    private float maxTemperature;
    private float minTemperature;

    public StatisticsDisplay(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(Observable observable) {
        if(observable instanceof WeatherData){
            WeatherData data = (WeatherData) observable;
            float temperature = data.getTemperature();
            temperaturesChangesSum += temperature;
            changesCount++;
            if(!checkedTemperature){
                minTemperature = maxTemperature = temperature;
                checkedTemperature = true;
            }else{
                if(temperature < minTemperature) minTemperature = temperature;
                if(temperature > maxTemperature) maxTemperature = temperature;
            }
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min Temperature: "+temperaturesChangesSum/changesCount+"/"+maxTemperature+"/"+minTemperature);
    }
}
