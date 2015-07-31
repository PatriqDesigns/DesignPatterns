package com.patriqdesigns.patterns.command.homeautomatation.device;

/**
 * Created by Andre on 20/07/15.
 */
public class CeilingFan {

    private String division;
    private int spinLevel;

    public CeilingFan(String division) {
        this.division = division;
    }

    public void on(){
        System.out.println(division+" ceiling fan is now on.");
    }

    public void off(){
        System.out.println(division+" ceiling fan is now off.");
    }

    public void setSpinLevel(int level){
        this.spinLevel = level;
        System.out.println(division+" ceiling fan spin level: "+level+".");
    }

    public int getSpinLevel() {
        return spinLevel;
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "division='" + division + '\'' +
                ", spinLevel=" + spinLevel +
                '}';
    }
}
