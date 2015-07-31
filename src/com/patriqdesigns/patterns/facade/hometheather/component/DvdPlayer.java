package com.patriqdesigns.patterns.facade.hometheather.component;

/**
 * Created by Andre on 21/07/15.
 */
public class DvdPlayer implements Player {

    private Amplifier amplifier;

    @Override
    public void on() {
        System.out.println("Turning dvd player on.");
    }

    @Override
    public void off() {
        System.out.println("Turning dvd player off.");
    }

    public void eject() {
        System.out.println("Dvd player is now ejecting.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing dvd player.");
    }

    @Override
    public void play(String title) {
        System.out.println("Playing \""+title+"\" on the dvd player.");
    }

    public void setSurroundAudio() {
        System.out.println("Setting dvd player audio mode to surround.");
    }

    public void setTwoChannelAudio() {
        System.out.println("Setting dvd player audio mode to two channels.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping dvd player.");
    }
}
