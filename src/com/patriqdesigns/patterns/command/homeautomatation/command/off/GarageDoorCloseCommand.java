package com.patriqdesigns.patterns.command.homeautomatation.command.off;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.GarageDoor;

/**
 * Created by Andre on 20/07/15.
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
