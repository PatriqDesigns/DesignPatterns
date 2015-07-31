package com.patriqdesigns.patterns.command.homeautomatation.device;

/**
 * Created by Andre on 20/07/15.
 */
public class Light {

    private String division;

    public Light(String division) {
        this.division = division;
    }

    public void on(){
        System.out.println(division+" light is now on.");
    }

    public void off(){
        System.out.println(division+" light is now off.");

    }

    @Override
    public String toString() {
        return "Light{" +
                "division='" + division + '\'' +
                '}';
    }
}
