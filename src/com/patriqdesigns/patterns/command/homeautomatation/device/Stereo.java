package com.patriqdesigns.patterns.command.homeautomatation.device;

/**
 * Created by Andre on 20/07/15.
 */
public class Stereo {

    private String division;
    private int volume;

    public Stereo(String division) {
        this.division = division;
    }

    public void on(){
        System.out.println(division+" stereo is now on.");
    }

    public void off(){
        System.out.println(division+" stereo is now off.");
    }

    public void setCd(){
        System.out.println(division+" stereo mode is now set to Cd playing.");
    }

    public void setDvd(){
        System.out.println(division+" stereo mode is now set to Dvd playing.");
    }

    public void setRadio(){
        System.out.println(division+" stereo mode is now set to Radio playing.");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(division+" stereo volume: "+volume+".");
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Stereo{" +
                "division='" + division + '\'' +
                ", volume=" + volume +
                '}';
    }
}
