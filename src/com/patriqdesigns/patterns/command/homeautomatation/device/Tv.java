package com.patriqdesigns.patterns.command.homeautomatation.device;

/**
 * Created by Andre on 20/07/15.
 */
public class Tv {

    private String division;
    private int channel;

    public Tv(String division) {
        this.division = division;
    }

    public void on(){
        System.out.println(division+" tv is now on.");
    }

    public void off(){
        System.out.println(division+" tv is now off.");
    }

    public void setChannel(int channel){
        this.channel = channel;
        System.out.println(division+" tv changed channel to channel: "+channel+".");
    }

    public int getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "division='" + division + '\'' +
                ", channel=" + channel +
                '}';
    }
}
