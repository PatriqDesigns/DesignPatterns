package com.patriqdesigns.patterns.compound.mvc.djcontrol.model;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMObserver;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BeatObserver;

/**
 * Created by Andre on 26/07/15.
 */
public class HeartModelAdapter implements BeatModelInterface {

    private HeartModelInterface heart;

    public HeartModelAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void setBPM(int bpm) {
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        heart.registerBeatObserver(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        heart.registerBPMObserver(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
    }
}
