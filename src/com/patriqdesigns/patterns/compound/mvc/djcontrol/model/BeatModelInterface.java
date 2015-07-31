package com.patriqdesigns.patterns.compound.mvc.djcontrol.model;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMObserver;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BeatObserver;

/**
 * Created by Andre on 25/07/15.
 */
public interface BeatModelInterface {
    public void initialize();

    public void on();

    public void off();

    public int getBPM();

    public void setBPM(int bpm);

    public void registerObserver(BeatObserver observer);

    public void removeObserver(BeatObserver observer);

    public void registerObserver(BPMObserver observer);

    public void removeObserver(BPMObserver observer);
}
