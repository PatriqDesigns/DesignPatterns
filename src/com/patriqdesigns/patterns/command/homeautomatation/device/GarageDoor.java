package com.patriqdesigns.patterns.command.homeautomatation.device;

/**
 * Created by Andre on 20/07/15.
 */
public class GarageDoor {
    public void up(){
        System.out.println("Garage door is going up.");
    }

    public void down(){
        System.out.println("Garage door is going down.");
    }

    public void stop(){
        System.out.println("Stopping garage.");
    }

    public void lightOn(){}

    public void lightOff(){}

    @Override
    public String toString() {
        return "GarageDoor{}";
    }
}
