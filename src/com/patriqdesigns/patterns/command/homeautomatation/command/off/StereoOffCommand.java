package com.patriqdesigns.patterns.command.homeautomatation.command.off;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.Stereo;

/**
 * Created by Andre on 20/07/15.
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;
    private int previousVolume;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        previousVolume = stereo.getVolume();
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setVolume(previousVolume);
    }
}
