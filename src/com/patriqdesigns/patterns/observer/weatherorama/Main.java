package com.patriqdesigns.patterns.observer.weatherorama;

import com.patriqdesigns.patterns.observer.weatherorama.display.CurrentConditionsDisplay;
import com.patriqdesigns.patterns.observer.weatherorama.display.Display;
import com.patriqdesigns.patterns.observer.weatherorama.display.StatisticsDisplay;

/**
 * Created by Andre on 15/07/15.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        Display currentConditionsDisplay = new CurrentConditionsDisplay(data);
        Display statisticsDisplay = new StatisticsDisplay(data);

        data.changeMeasurements(100, 20, 30);
        data.changeMeasurements(20, 30, 100);
        data.changeMeasurements(10, 203, 11);
    }
}
