package com.patriqdesigns.patterns.facade.hometheather.component;

/**
 * Created by Andre on 21/07/15.
 */
public class CdPlayer implements Player {

    @Override
    public void on() {
        System.out.println("Turning cd player on.");
    }

    @Override
    public void play(String title) {
        System.out.println("Playing cd player.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing cd player.");
    }

    public void eject(){
        System.out.println("Cd player is now ejecting.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping cd player.");
    }

    @Override
    public void off() {
        System.out.println("Turning off cd player.");
    }
}
