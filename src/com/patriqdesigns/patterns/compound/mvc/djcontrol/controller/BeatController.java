package com.patriqdesigns.patterns.compound.mvc.djcontrol.controller;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.model.BeatModelInterface;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.view.DJView;

/**
 * Created by Andre on 25/07/15.
 */
public class BeatController implements BeatControllerInterface {

    private BeatModelInterface model;
    private DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        this.view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.enableStartMenuItem();
        view.disableStopMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
