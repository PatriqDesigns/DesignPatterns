package com.patriqdesigns.patterns.compound.mvc.djcontrol.controller;

import com.patriqdesigns.patterns.compound.mvc.djcontrol.model.HeartModelAdapter;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.model.HeartModelInterface;
import com.patriqdesigns.patterns.compound.mvc.djcontrol.view.DJView;

/**
 * Created by Andre on 26/07/15.
 */
public class HeartController implements BeatControllerInterface {

    private HeartModelInterface model;
    private DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        this.view = new DJView(this, new HeartModelAdapter(model));
        view.createView();
        view.createControls();
        view.disableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void increaseBPM() {
    }

    @Override
    public void decreaseBPM() {
    }

    @Override
    public void setBPM(int bpm) {
    }
}
