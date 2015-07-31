package com.patriqdesigns.patterns.command.homeautomatation.remote;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;

/**
 * Created by Andre on 20/07/15.
 */
public class SimpleRemoteControl {

    private Command slot;

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
