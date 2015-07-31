package com.patriqdesigns.patterns.facade.hometheather.component;

/**
 * Created by Andre on 21/07/15.
 */
public class TheaterLights {
    public void on(){
        System.out.println("Turning theater lights on.");
    }

    public void off(){
        System.out.println("Turning theater lights off.");
    }

    public void dim(int percent){
        System.out.println("Setting theater lights' dim to "+percent+"%.");
    }
}
