package com.patriqdesigns.patterns.command.homeautomatation.command.on;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.Tv;

/**
 * Created by Andre on 20/07/15.
 */
public class TvOnCommand implements Command {

    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setChannel(4);
    }

    @Override
    public void undo() {
        tv.off();
    }
}
