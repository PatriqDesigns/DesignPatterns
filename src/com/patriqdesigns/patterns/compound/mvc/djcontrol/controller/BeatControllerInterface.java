package com.patriqdesigns.patterns.compound.mvc.djcontrol.controller;

/**
 * Created by Andre on 25/07/15.
 */
public interface BeatControllerInterface {
    public void start();

    public void stop();

    public void increaseBPM();

    public void decreaseBPM();

    public void setBPM(int bpm);
}
