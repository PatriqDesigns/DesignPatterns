package com.patriqdesigns.patterns.facade.hometheather.component;

/**
 * Created by Andre on 21/07/15.
 */
public class Amplifier {

    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {
        System.out.println("Turning amplifier on.");
    }

    public void off() {
        System.out.println("Turning amplifier off.");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println("Setting amplifier to Cd input.");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Setting amplifier to Dvd input.");
    }

    public void setStereoSound() {
        System.out.println("Setting amplifier sound mode to stereo sound.");
    }

    public void setSurroundSound() {
        System.out.println("Setting amplifier sound mode to surround mode.");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Setting amplifier's tuner.");
    }

    public void setVolume(int volume) {
        System.out.println("Setting amplifier's volume to "+volume+".");
    }
}
