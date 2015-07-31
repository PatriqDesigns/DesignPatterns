package com.patriqdesigns.patterns.command.homeautomatation.command.on;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.Stereo;

/**
 * Created by Andre on 20/07/15.
 */
public class StereoOnWithDvdCommand implements Command {

    private Stereo stereo;

    public StereoOnWithDvdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
