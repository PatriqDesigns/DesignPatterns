package com.patriqdesigns.patterns.command.homeautomatation.command.on;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.CeilingFan;

/**
 * Created by Andre on 20/07/15.
 */
public class CeilingFanOnCommand implements Command {

    private CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
        fan.setSpinLevel(3);
    }

    @Override
    public void undo() {
        fan.off();
    }
}
