package com.patriqdesigns.patterns.facade.hometheather.component;

/**
 * Created by Andre on 21/07/15.
 */
public class Tuner {

    private Amplifier amplifier;

    public void on() {
        System.out.println("Turning tuner on.");
    }

    public void off() {
        System.out.println("Turning tuner off.");
    }

    public void setAm() {
        System.out.println("Setting tuner to Am mode.");
    }

    public void setFm() {
        System.out.println("Setting tuner to Fm mode.");
    }

    public void setFrequency(int frequency) {
        System.out.println("Setting tuner's frequency to "+frequency+".");
    }

}
