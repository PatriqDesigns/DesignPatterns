package com.patriqdesigns.patterns.command.homeautomatation.command.on;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.GarageDoor;

/**
 * Created by Andre on 20/07/15.
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
