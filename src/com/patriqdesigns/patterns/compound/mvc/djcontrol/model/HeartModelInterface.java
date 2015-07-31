package com.patriqdesigns.patterns.compound.mvc.djcontrol.model;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.BPMObserver;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.BeatObserver;

/**
 * Created by Andre on 26/07/15.
 */
public interface HeartModelInterface {
    public int getHeartRate();

    public void registerBeatObserver(BeatObserver beatObserver);

    public void registerBPMObserver(BPMObserver bpmObserver);
}
