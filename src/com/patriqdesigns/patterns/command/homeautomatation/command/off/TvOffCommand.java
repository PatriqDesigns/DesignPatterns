package com.patriqdesigns.patterns.command.homeautomatation.command.off;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;
import com.patriqdesigns.patterns.command.homeautomatation.device.Tv;

/**
 * Created by Andre on 20/07/15.
 */
public class TvOffCommand implements Command {

    private Tv tv;
    private int previousChannel;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        previousChannel = tv.getChannel();
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
        tv.setChannel(previousChannel);
    }
}
