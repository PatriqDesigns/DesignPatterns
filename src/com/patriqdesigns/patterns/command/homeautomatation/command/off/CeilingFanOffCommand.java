package com.patriqdesigns.patterns.command.homeautomatation.command.off;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.CeilingFan;

/**
 * Created by Andre on 20/07/15.
 */
public class CeilingFanOffCommand implements Command {

    private CeilingFan fan;
    private int previousSpinLevel;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpinLevel = fan.getSpinLevel();
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
        fan.setSpinLevel(previousSpinLevel);
    }
}
