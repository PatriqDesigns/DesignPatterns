package com.patriqdesigns.patterns.command.homeautomatation.command;

/**
 * Created by Andre on 20/07/15.
 */
public interface Command {
    public void execute();
    public void undo();
}
